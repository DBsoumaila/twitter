package com.ensias.twitter.repo.messages;


import com.ensias.twitter.model.messages.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MessageRepo extends JpaRepository <Message,Integer>{
	
	

}
