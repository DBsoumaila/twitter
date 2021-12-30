package com.ensias.twitter.repo.users;


import com.ensias.twitter.model.users.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AbonnementRepo extends JpaRepository <Abonnement,Integer>{
	
	

}
