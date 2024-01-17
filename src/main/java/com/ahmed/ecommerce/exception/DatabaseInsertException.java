package com.ahmed.ecommerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class DatabaseInsertException extends RuntimeException {
    public DatabaseInsertException(String message, Throwable cause) {
        super(message, cause);
    }
}
