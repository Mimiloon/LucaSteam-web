package com.ejemplos.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ejemplos.spring.model.Game;

@Repository
public interface GameDAO extends JpaRepository<Game,Integer> {

//	@Query("SELECT name FROM vgsales WHERE name =?1")
//	List<Game> findByName(String name);

}
