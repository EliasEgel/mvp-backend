package org.example.pokedexbackend.mapper;


import org.example.pokedexbackend.dto.TeamDto;
import org.example.pokedexbackend.dto.UserDto;
import org.example.pokedexbackend.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper {

    private final TeamMapper teamMapper;

    public UserMapper(TeamMapper teamMapper) {
        this.teamMapper = teamMapper;
    }

    public UserDto toFullDto(User user) {
        if (user == null) return null;

        List<TeamDto> teams = user.getTeams().stream()
                .map(teamMapper::toDto)
                .toList();

        return new UserDto(user.getId(), user.getUsername(), teams);
    }
}
