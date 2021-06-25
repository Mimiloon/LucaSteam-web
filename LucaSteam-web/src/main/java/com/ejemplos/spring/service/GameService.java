package com.ejemplos.spring.service;

import java.util.List;
import java.util.Optional;

import com.ejemplos.spring.model.Game;

public interface GameService {

		//LISTAR TODOS LOS JUEGOS
		public List<Game> findAll();
		
		//RECUPERAR JUEGOS
		public Optional<Game> getOne(int rank);
		
		//ACTUALIZAR Y AÑADIR JUEGOS
		public void save(Game game);
		
		//BORRAR POR RANK
		public void deleteByRank(int rank);
		
		//BUSCADOR POR NOMBRE DE JUEGO
		public List<Game> findByName(String name);
		
		//BUSCADOR POR AÑO INTRODUCIDO
		public List<Game>findByYear(int year);
		
		//LISTADO POR GÉNERO: PLATAFORMA
		public List<Game>findByGenre();
		
		//LISTADO POR EDITOR: NINTENDO
		public List<Game>findByPublisher();
}
