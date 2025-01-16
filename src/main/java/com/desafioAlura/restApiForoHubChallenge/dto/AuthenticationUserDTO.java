package com.desafioAlura.restApiForoHubChallenge.dto;



import jakarta.validation.constraints.NotNull;

public record AuthenticationUserDTO(

        @NotNull
        String username,

        @NotNull
        String password
) {
}
