package com.bar.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bar.demo.exception.UserNotFoundException;
import com.bar.demo.model.Suggestion;
import com.bar.demo.repo.SuggestionRepo;
import com.bar.demo.model.Suggestion;





@Service
@Transactional
public class Suggestionservice {
	@Autowired
	private SuggestionRepo suggestionRepo;
	
	public List <Suggestion> listAll() {
		return suggestionRepo.findAll();
	}
	
	public Suggestion save(Suggestion admin) {
		return suggestionRepo.save(admin);
	}
	
	public Suggestion getSuggestion(int id) {
		return suggestionRepo.findById(id).orElseThrow(() -> new UserNotFoundException("Suggestions avec " + id + " N'existe pas"));
	}
	
	public void delete(int id) {
		suggestionRepo.deleteById(id);
	}
	//update by Suggestion
	 public Suggestion updateAdminBysuggestion(Suggestion admin) {
	        return suggestionRepo.save(admin);
	 }
	 
	
	 
	 //micro service de suivie
	 //service d'abonnement
//	 public Suggestion updateAdminById(int id) {
//	        return repoAdmin.save(Product());
//	 }
	

}
