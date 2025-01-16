package com.desafioAlura.restApiForoHubChallenge.exception;



public class ValidationException extends RuntimeException {

    public ValidationException(String message) {
        super(message);
    }
}
