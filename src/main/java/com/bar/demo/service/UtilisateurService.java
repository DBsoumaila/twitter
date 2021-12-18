package com.bar.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bar.demo.exception.UserNotFoundException;
import com.bar.demo.model.Utilisateur;
import com.bar.demo.model.Utilisateur;
import com.bar.demo.repo.UtilisateurRepo;
import com.bar.demo.repo.UtilisateurRepo;




@Service
@Transactional
public class UtilisateurService {
	@Autowired
	private UtilisateurRepo repoAdmin;
	
	public List <Utilisateur> listAll() {
		return repoAdmin.findAll();
	}
	
	public Utilisateur save(Utilisateur admin) {
		return repoAdmin.save(admin);
	}
	
	public Utilisateur getUtilisateur(int id) {
		return repoAdmin.findById(id).orElseThrow(() -> new UserNotFoundException("Utilisateur avec " + id + " N'existe pas"));
	}
	
	public void delete(int id) {
		repoAdmin.deleteById(id);
	}
	//update by Utilisateur
	 public Utilisateur updateAdminByUtilisateur(Utilisateur admin) {
	        return repoAdmin.save(admin);
	 }
	 
	
	 
	 //micro service de suivie
	 //service d'abonnement
//	 public Utilisateur updateAdminById(int id) {
//	        return repoAdmin.save(Product());
//	 }
	

}
