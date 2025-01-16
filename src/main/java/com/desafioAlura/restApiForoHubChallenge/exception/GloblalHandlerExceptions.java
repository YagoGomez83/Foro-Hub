package com.desafioAlura.restApiForoHubChallenge.exception;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GloblalHandlerExceptions {


    @ExceptionHandler(ValidationException.class)
    public ResponseEntity handlingValidationsExceptions(ValidationException e) {
        return  ResponseEntity.badRequest().body("Error: " + e.getMessage());
    }
}
