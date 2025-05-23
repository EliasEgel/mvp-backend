package org.example.pokedexbackend.dto;

import java.util.List;

public record TeamDto(
        Long id,
        String name,
        List<TeamPokemonDto> pokemon
) {
}
