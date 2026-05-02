package com.technokratos.agona.exceptions;


import com.technokratos.agona.exceptions.AuthenticationException;

public class InvalidAccessTokenException extends AuthenticationException {
    public InvalidAccessTokenException(String message) {
        super(message);
    }
}
