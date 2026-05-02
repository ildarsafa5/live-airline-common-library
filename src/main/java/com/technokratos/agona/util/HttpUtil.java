package com.technokratos.agona.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.technokratos.agona.exceptions.AuthenticationHeaderException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class HttpUtil {

    public static String getToken(String header) {
        if (header == null || header.isEmpty()) {
            throw new AuthenticationHeaderException("Authorization header is empty");
        }
        if (!header.startsWith("Bearer ")) {
            throw new AuthenticationHeaderException("Authorization header is invalid");
        }
        return extractToken(header);
    }

    private static String extractToken(String header) {
        return header.substring(7);
    }

    public static void putExceptionInResponse(HttpServletRequest req, HttpServletResponse resp, Exception ex, int status) throws IOException {
        resp.setStatus(status);
        resp.setContentType("application/json");
        Map<String,Object> body = new HashMap<>();
        body.put("message", ex.getMessage());
        body.put("error","Unauthorized");
        body.put("status",status);
        body.put("path",req.getRequestURI());
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(resp.getOutputStream(),body);
    }
}
