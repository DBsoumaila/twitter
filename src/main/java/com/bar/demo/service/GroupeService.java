package com.bar.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bar.demo.exception.UserNotFoundException;
import com.bar.demo.model.Groupe;
import com.bar.demo.repo.GroupeRepo;
import com.bar.demo.model.Groupe;





@Service
@Transactional
public class GroupeService {
	@Autowired
	private GroupeRepo GroupeRepo;
	
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
