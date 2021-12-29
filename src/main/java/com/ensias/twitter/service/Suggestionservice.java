package com.ensias.twitter.service;

import java.util.List;

import com.ensias.twitter.repo.SuggestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensias.twitter.exception.UserNotFoundException;
import com.ensias.twitter.model.Suggestion;


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
