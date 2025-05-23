package org.example.pokedexbackend.dto;

public record TeamPokemonDto(
        String pokemonName,
        String nickname,
        Integer position
) {
}
