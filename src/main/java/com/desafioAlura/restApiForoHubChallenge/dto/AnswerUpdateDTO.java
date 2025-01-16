package com.desafioAlura.restApiForoHubChallenge.dto;



import jakarta.validation.constraints.NotNull;

public record AnswerUpdateDTO(

        @NotNull
        String message
) {
}
