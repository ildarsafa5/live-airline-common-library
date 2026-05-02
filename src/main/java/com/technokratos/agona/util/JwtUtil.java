package com.technokratos.agona.util;

import com.technokratos.agona.dtos.response.AccountResponse;
import com.technokratos.agona.enums.Role;
import com.technokratos.agona.exceptions.InvalidAccessTokenException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import javax.crypto.SecretKey;
import java.util.Date;
import java.util.UUID;

public class JwtUtil {

    public Claims parseJwtToken(String jwtToken,SecretKey secretKey) {
        return Jwts.parser()
                .verifyWith(secretKey)
                .build()
                .parseSignedClaims(jwtToken)
                .getPayload();
    }

    public void validateToken(String jwtToken,SecretKey secretKey) {
        try {
            Claims claims = parseJwtToken(jwtToken,secretKey);
            if (claims.getExpiration().before(new Date())) {
                throw new InvalidAccessTokenException("Token is expired");
            }
        } catch (Exception e) {
            throw new InvalidAccessTokenException(e.getMessage());
        }
    }

    public AccountResponse extractUser(String jwtToken, SecretKey secretKey) {
        Claims claims = parseJwtToken(jwtToken,secretKey);
        AccountResponse accountResponse = new AccountResponse();
        accountResponse.setAccountId(UUID.fromString(claims.getSubject()));
        accountResponse.setRole(Role.valueOf(claims.get("role", String.class)));
        return accountResponse;
    }
}
