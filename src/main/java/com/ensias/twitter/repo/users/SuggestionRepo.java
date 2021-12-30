package com.ensias.twitter.repo.users;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensias.twitter.model.users.Suggestion;


@Repository
public interface SuggestionRepo extends JpaRepository <Suggestion,Integer>{
	
	

}
