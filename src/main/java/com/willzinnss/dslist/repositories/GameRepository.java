package com.willzinnss.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willzinnss.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
