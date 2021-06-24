package com.ejemplos.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplos.spring.model.Game;

@Repository
public interface GameDAO extends JpaRepository<Game, Integer> {

	
//	@Transactional
//	@Modifying
//	@Query(value = "DELETE FROM vgsales WHERE `Rank` =?1", nativeQuery = true)
//	void deleteById(Integer id);

//	@Query("SELECT name FROM vgsales WHERE name =?1")
//	List<Game> findByName(String name);

}
