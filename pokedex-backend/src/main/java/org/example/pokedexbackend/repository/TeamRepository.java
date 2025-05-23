package org.example.pokedexbackend.repository;

import org.example.pokedexbackend.model.Team;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends ListCrudRepository<Team, Long> {
}
