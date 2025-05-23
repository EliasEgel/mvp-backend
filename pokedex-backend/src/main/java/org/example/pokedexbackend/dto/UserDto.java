package org.example.pokedexbackend.dto;

import org.example.pokedexbackend.model.Team;

import java.util.List;

public record UserDto(
        Long id,
        String username,
        List<TeamDto> teams
        ) {
}
