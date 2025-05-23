package org.example.pokedexbackend.mapper;

import org.example.pokedexbackend.dto.TeamPokemonDto;
import org.example.pokedexbackend.model.TeamPokemon;
import org.springframework.stereotype.Component;

@Component
public class TeamPokemonMapper {

    public TeamPokemonDto toDto(TeamPokemon entity) {
        if (entity == null) return null;
        return new TeamPokemonDto(
                entity.getPokemonName(),
                entity.getNickname(),
                entity.getPosition()
        );
    }
}

