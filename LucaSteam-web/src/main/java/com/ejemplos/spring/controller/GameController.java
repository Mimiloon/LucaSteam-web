package com.ejemplos.spring.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ejemplos.spring.model.Game;
import com.ejemplos.spring.service.GameService;

@Controller
public class GameController {

	@Autowired
	GameService service;

	private static final Logger log = LoggerFactory.getLogger(GameController.class);

	// LISTAR JUEGOS
	@GetMapping("/lucasteam")
	public String listGame(Model m) {
		log.info("----- Inside listGame");

		m.addAttribute("gameList", service.findAll());
		//TODO borrar y reemplazar con lo de arriba cuando tengamos la bbdd hecha y con datos
//		m.addAttribute("gameList", new ArrayList<>());
		return "GameList";
	}

	// EDITAR JUEGOS
	@GetMapping("/lucasteam/edit")
	public String editGame(@RequestParam("rank") int rank, Model m) {
		log.info("----- Inside editGame");
		m.addAttribute("game", service.getOne(rank));
		return "GameForm";
	}

	// BORRAR JUEGOS
	@GetMapping("/lucasteam/delete") 
	public String deleteGame(@RequestParam("rank") int rank) { 
		log.info("----- Inside deleteGame");
		service.deleteByRank(rank);
		return ("redirect:/lucasteam");
	}

//	@GetMapping("backoffice/proyectos/delete")
//	public ModelAndView deleteProject(@RequestParam("id") int id) {
//		log.info("----- Inside deleteProject");
//		projectService.deleteById(id);
//		return new ModelAndView("redirect:/backoffice/proyectos");
//	}

//	 CREAR JUEGO
	@GetMapping("/lucasteam/new")
	public String newGame(Game game) {
		log.info("----- Inside newGame");
		return "GameForm";
	}

	// GUARDAR JUEGO TRAS MODIFICACIÓN/ALTA
	@PostMapping("/lucasteam/save")
	public ModelAndView saveGame(Game game) {
		log.info("----- Inside saveGame");
		service.save(game);
		return new ModelAndView("redirect:/lucasteam");
	}

}
