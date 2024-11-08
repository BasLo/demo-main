package com.demo.main.exception;

/**
 * Выбрасывается если не найден ресурс
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }

}
