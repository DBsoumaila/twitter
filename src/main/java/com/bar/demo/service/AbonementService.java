package com.bar.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bar.demo.exception.UserNotFoundException;
import com.bar.demo.model.Abonnement;
import com.bar.demo.repo.AbonnementRepo;






@Service
@Transactional
public class AbonementService {
	@Autowired
	private AbonnementRepo abonnementRepo;
	
	public List <Abonnement> listAll() {
		return abonnementRepo.findAll();
	}
	
	public Abonnement save(Abonnement admin) {
		return abonnementRepo.save(admin);
	}
	
	public Abonnement getabonnement(int id) {
		return abonnementRepo.findById(id).orElseThrow(() -> new UserNotFoundException("abonnements avec " + id + " N'existe pas"));
	}
	
	public void delete(int id) {
		abonnementRepo.deleteById(id);
	}
	//update by abonnement
	 public Abonnement updateAdminByabonnement(Abonnement admin) {
	        return abonnementRepo.save(admin);
	 }
	 
	
	 
	 //micro service de suivie
	 //service d'abonnement
//	 public abonnement updateAdminById(int id) {
//	        return repoAdmin.save(Product());
//	 }
	

}
