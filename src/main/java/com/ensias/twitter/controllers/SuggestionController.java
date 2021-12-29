package com.ensias.twitter.controllers;

import java.util.List;

import com.ensias.twitter.model.Suggestion;
import com.ensias.twitter.service.Suggestionservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name="/suggestion")
public class SuggestionController {

	
	@Autowired
	private Suggestionservice suggestionService;
	
	 @GetMapping("/suggestion/all")
	    public ResponseEntity<List<Suggestion> > getAllSuggestions() {
		 
		  List<Suggestion> suggestions =  suggestionService.listAll();
	       
	        return new ResponseEntity<>(suggestions, HttpStatus.OK);
	    }

	    @GetMapping("/suggestion/find/{id}")
	    public ResponseEntity<Suggestion> getAdminById (@PathVariable("id") int id) {
	        Suggestion admin = suggestionService.getSuggestion(id);
	        return new ResponseEntity<>(admin, HttpStatus.OK);
	    }

	    @PostMapping("/suggestion/add")
	    public ResponseEntity<Suggestion> addAdmin(@RequestBody Suggestion admin) {
	        Suggestion newAdmin = suggestionService.save(admin);
	        return new ResponseEntity<>(newAdmin, HttpStatus.CREATED);
	    }

	    @PutMapping("/suggestion/update")
	    public ResponseEntity<Suggestion> updateAdmin(@RequestBody Suggestion admin) {
	        Suggestion updateAdmin = suggestionService.updateAdminBysuggestion(admin);
	        return new ResponseEntity<>(updateAdmin, HttpStatus.OK);
	    }

	    @DeleteMapping("/suggestion/delete/{id}")
	    public ResponseEntity<?> deleteAdmin(@PathVariable("id") int id) {
	    	suggestionService.delete(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
	   

}
