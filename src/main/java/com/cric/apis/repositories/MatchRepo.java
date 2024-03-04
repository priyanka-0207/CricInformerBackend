package com.cric.apis.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cric.apis.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer> {
// match ko fetch karna chahti hu  --->
	// provide krdde  --> teamHeading
	
	Optional<Match> findByTeamHeading(String teamHeading); 
	

}
