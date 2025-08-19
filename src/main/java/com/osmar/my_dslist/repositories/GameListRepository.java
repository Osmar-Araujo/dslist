package com.osmar.my_dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.osmar.my_dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
