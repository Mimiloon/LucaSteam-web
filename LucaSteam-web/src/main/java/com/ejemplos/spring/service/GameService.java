package com.ejemplos.spring.service;

import java.util.List;

import com.ejemplos.spring.model.Game;

public interface GameService {

		//LISTAR TODOS LOS JUEGOS
		public List<Game> findAll();
		
		//RECUPERAR JUEGOS
		public Game getOne(int rank);
		
		//ACTUALIZAR Y AÑADIR JUEGOS
		public void save(Game game);
		
		//BORRAR POR RANK
		public void deleteByRank(int rank);
		
		//BUSCADOR POR NOMBRE DE JUEGO
		public List<Game> findByName(String name);
}
