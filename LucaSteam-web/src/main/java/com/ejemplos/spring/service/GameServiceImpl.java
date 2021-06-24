package com.ejemplos.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ejemplos.spring.repository.GameDAO;

import com.ejemplos.spring.model.Game;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	GameDAO gameDAO;

	@Override
	public List<Game> findAll() {
		return gameDAO.findAll();

	}

	// PARA
	@Override
	public Game getOne(int rank) {
		return gameDAO.getOne(rank);
		
	}

	@Override
	public void save(Game game) {
		gameDAO.save(game);	

	}

	@Override
	public void deleteByRank(int rank) {
		gameDAO.deleteById(rank);

	}

	@Override
	public List<Game> findByName(String name) {
//		return gameDAO.findByName(name);
		return null;
		

	}

}
