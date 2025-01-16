package com.desafioAlura.restApiForoHubChallenge.dto;



import jakarta.validation.constraints.NotNull;

public record UserCreateDTO(
        @NotNull
        String username,

        @NotNull
        String email,

        @NotNull
        String password
) {
}
