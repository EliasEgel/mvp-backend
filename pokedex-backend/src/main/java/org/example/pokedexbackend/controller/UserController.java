package org.example.pokedexbackend.controller;

import org.example.pokedexbackend.dto.UserDto;
import org.example.pokedexbackend.model.User;
import org.example.pokedexbackend.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    ResponseEntity<List<UserDto>> getAllUsers(){
        List<UserDto> users = userService.getUsers();
        return ResponseEntity.ok().body(users);
    }

}
