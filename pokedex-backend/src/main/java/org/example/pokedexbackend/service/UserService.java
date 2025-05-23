package org.example.pokedexbackend.service;


import org.example.pokedexbackend.dto.UserDto;
import org.example.pokedexbackend.mapper.UserMapper;
import org.example.pokedexbackend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    public List<UserDto> getUsers() {

        return userRepository.findAll().stream().map(userMapper::toFullDto).toList();
    }
}
