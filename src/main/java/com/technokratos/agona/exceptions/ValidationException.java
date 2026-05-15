package com.technokratos.agona.exceptions;

import org.springframework.http.HttpStatus;

public class ValidationException extends ServiceException{
    public ValidationException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
