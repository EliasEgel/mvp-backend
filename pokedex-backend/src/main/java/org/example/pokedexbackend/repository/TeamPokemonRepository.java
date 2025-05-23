package org.example.pokedexbackend.repository;

import org.example.pokedexbackend.model.TeamPokemon;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamPokemonRepository extends ListCrudRepository<TeamPokemon, Long> {
}
