package com.ensias.twitter.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensias.twitter.model.Message;


@Repository
public interface MessageRepo extends JpaRepository <Message,Integer>{
	
	

}