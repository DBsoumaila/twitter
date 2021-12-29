package com.ensias.twitter.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensias.twitter.model.Groupe;


@Repository
public interface GroupeRepo extends JpaRepository <Groupe,Integer>{
	
	

}
