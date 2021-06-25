package com.ejemplos.spring.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplos.spring.model.Game;

@Repository
public interface GameDAO extends JpaRepository<Game, Integer> {
	
	@Query (value="SELECT * FROM vgsales WHERE year=?1",nativeQuery = true)
	List <Game> findByYear(int year);
	
	@Query (value="SELECT * FROM vgsales WHERE genre='Platform'",nativeQuery = true)
	List <Game> findByGenre();
	
	@Query (value="SELECT * FROM vgsales WHERE publisher='Nintendo'",nativeQuery = true)
	List <Game> findByPublisher();
	
//	@Transactional
//	@Modifying
//	@Query(value = "DELETE FROM vgsales WHERE `Rank` =?1", nativeQuery = true)
//	void deleteById(Integer id);

//	@Query("SELECT name FROM vgsales WHERE name =?1")
//	List<Game> findByName(String name);

}
