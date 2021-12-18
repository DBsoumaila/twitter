package com.bar.demo.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bar.demo.model.Groupe;
import com.bar.demo.model.Utilisateur;



@Repository
public interface GroupeRepo extends JpaRepository <Groupe,Integer>{
	
	

}
