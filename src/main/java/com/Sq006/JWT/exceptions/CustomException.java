package com.Sq006.JWT.exceptions;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {
    /**
     * For serialization: if any changes is made to this class, update the
     * serialversionID
     */
    private static final long serialVersionUID = 1L;

    private final String message;
    private final HttpStatus status;
    private Throwable cause;

    public CustomException(String message, Throwable cause, HttpStatus status) {
        this.message = message;
        this.cause = cause;
        this.status = status;
    }

    public CustomException(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public Throwable getCause() {
        return cause;
    }

}
