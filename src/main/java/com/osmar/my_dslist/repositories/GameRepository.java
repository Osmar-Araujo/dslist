package com.osmar.my_dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.osmar.my_dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
