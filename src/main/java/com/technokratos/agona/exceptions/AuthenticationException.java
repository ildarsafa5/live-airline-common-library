package com.technokratos.agona.exceptions;

import org.springframework.http.HttpStatus;

public class AuthenticationException extends ServiceException {
    public AuthenticationException(String message) {
        super(message, HttpStatus.UNAUTHORIZED);
    }
}

