package com.ensias.twitter.repo.messages;


import com.ensias.twitter.model.messages.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GroupeRepo extends JpaRepository <Groupe,Integer>{
	
	

}
