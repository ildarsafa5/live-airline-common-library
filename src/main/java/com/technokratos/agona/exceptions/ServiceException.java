package com.technokratos.agona.exceptions;

import org.springframework.http.HttpStatus;

public class ServiceException extends RuntimeException {
    private HttpStatus status;
    public ServiceException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}