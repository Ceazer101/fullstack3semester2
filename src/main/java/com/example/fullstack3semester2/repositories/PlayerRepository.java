package com.example.fullstack3semester2.repositories;

import com.example.fullstack3semester2.entity.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Integer> {
}
