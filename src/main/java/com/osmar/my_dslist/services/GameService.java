package com.osmar.my_dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osmar.my_dslist.dto.GameMinDTO;
import com.osmar.my_dslist.entities.Game;
import com.osmar.my_dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		 
		return result.stream().map(game -> new GameMinDTO(game)).toList();
	}

}
