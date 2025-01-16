package com.desafioAlura.restApiForoHubChallenge.controller;



import com.desafioAlura.restApiForoHubChallenge.dto.UserCreateDTO;
import com.desafioAlura.restApiForoHubChallenge.dto.UserUpdateDTO;
import com.desafioAlura.restApiForoHubChallenge.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity createUser(@RequestBody @Valid UserCreateDTO userCreateDTO) {
        userService.createNewUser(userCreateDTO);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update")
    public ResponseEntity updateUser(@RequestBody @Valid UserUpdateDTO userUpdateDTO) {
        userService.updateUser(userUpdateDTO);
        return ResponseEntity.ok().build();
    }
}
