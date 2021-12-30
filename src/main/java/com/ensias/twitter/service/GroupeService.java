package com.ensias.twitter.service;

import java.util.List;

import com.ensias.twitter.model.messages.Groupe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensias.twitter.exception.UserNotFoundException;


@Service
@Transactional
public class GroupeService {
	@Autowired
	private com.ensias.twitter.repo.messages.GroupeRepo GroupeRepo;
	
	public List <Groupe> listAll() {
		return GroupeRepo.findAll();
	}
	
	public Groupe save(Groupe admin) {
		return GroupeRepo.save(admin);
	}
	
	public Groupe getGroupe(int id) {
		return GroupeRepo.findById(id).orElseThrow(() -> new UserNotFoundException("Groupes avec " + id + " N'existe pas"));
	}
	
	public void delete(int id) {
		GroupeRepo.deleteById(id);
	}
	//update by Groupe
	 public Groupe updateAdminByGroupe(Groupe admin) {
	        return GroupeRepo.save(admin);
	 }
	 
	
	 
	 //micro service de suivie
	 //service d'abonnement
//	 public Groupe updateAdminById(int id) {
//	        return repoAdmin.save(Product());
//	 }
	

}
