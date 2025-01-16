package com.desafioAlura.restApiForoHubChallenge.dto;



import jakarta.validation.constraints.NotNull;

public record UserUpdateDTO(

        @NotNull
        String actualEmail,

        String newUserName,
        String newEmail,
        String newPassword
) {
}

