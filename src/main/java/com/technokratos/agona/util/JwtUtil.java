package com.technokratos.agona.util;

import com.technokratos.agona.dtos.response.AccountResponse;
import com.technokratos.agona.enums.Role;
import com.technokratos.agona.exceptions.InvalidAccessTokenException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import java.security.interfaces.RSAPublicKey;
import java.util.Date;
import java.util.UUID;

public class JwtUtil {

    private static Claims parseJwtToken(String jwtToken, RSAPublicKey publicKey) {
        return Jwts.parser()
                .verifyWith(publicKey)
                .build()
                .parseSignedClaims(jwtToken)
                .getPayload();
    }

    public static Claims validateToken(String jwtToken,RSAPublicKey publicKey) {
        try {
            Claims claims = parseJwtToken(jwtToken,publicKey);
            if (claims.getExpiration().before(new Date())) {
                throw new InvalidAccessTokenException("Token is expired");
            }
            return claims;
        } catch (Exception e) {
            throw new InvalidAccessTokenException(e.getMessage());
        }
    }

    public static AccountResponse extractUser(String jwtToken, RSAPublicKey publicKey) {
        Claims claims = parseJwtToken(jwtToken,publicKey);
        AccountResponse accountResponse = new AccountResponse();
        accountResponse.setAccountId(UUID.fromString(claims.getSubject()));
        accountResponse.setEmail(claims.get("email", String.class));
        accountResponse.setRole(Role.valueOf(claims.get("role", String.class)));
        return accountResponse;
    }
}
