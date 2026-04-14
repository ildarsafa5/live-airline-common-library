package com.technokratos.agona.exceptions;

import org.springframework.http.HttpStatus;

public class ConflictException extends ServiceException{
    public ConflictException(String message) {
        super(message, HttpStatus.CONFLICT);
    }
}
