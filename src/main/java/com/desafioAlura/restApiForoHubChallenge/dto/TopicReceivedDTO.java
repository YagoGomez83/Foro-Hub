package com.desafioAlura.restApiForoHubChallenge.dto;


public record TopicReceivedDTO(
        String title,
        Long idCourse,
        Long idUser,
        String message
) {
}
