package org.example.pokedexbackend.mapper;

import org.example.pokedexbackend.dto.TeamDto;
import org.example.pokedexbackend.dto.TeamPokemonDto;
import org.example.pokedexbackend.model.Team;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamMapper {

    private final TeamPokemonMapper teamPokemonMapper;

    public TeamMapper(TeamPokemonMapper teamPokemonMapper) {
        this.teamPokemonMapper = teamPokemonMapper;
    }

    public TeamDto toDto(Team team) {
        if (team == null) return null;

        List<TeamPokemonDto> pokemon = team.getPokemons().stream()
                .map(teamPokemonMapper::toDto)
                .toList();

        return new TeamDto(team.getId(), team.getName(), pokemon);
    }
}

