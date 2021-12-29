package com.ensias.twitter.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensias.twitter.model.Suggestion;


@Repository
public interface SuggestionRepo extends JpaRepository <Suggestion,Integer>{
	
	

}
