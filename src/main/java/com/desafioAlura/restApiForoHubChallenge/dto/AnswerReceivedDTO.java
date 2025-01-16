package com.desafioAlura.restApiForoHubChallenge.dto;



import jakarta.validation.constraints.NotNull;

public record AnswerReceivedDTO(
        @NotNull
        Long userId,

        @NotNull
        Long topicId,

        @NotNull
        String message
) {
}
