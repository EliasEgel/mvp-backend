package org.example.pokedexbackend.repository;

import org.example.pokedexbackend.model.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ListCrudRepository<User, Long> {
}
