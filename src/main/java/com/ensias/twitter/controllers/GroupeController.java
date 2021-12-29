package com.ensias.twitter.controllers;

import java.util.List;

import com.ensias.twitter.model.Groupe;
import com.ensias.twitter.service.GroupeService;
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
@RequestMapping(name="/groupe")
public class GroupeController {

	
	@Autowired
	private GroupeService groupeService;
	
	 @GetMapping("/groupe/all")
	    public ResponseEntity<List<Groupe> > getAllProducts() {
		 
		  List<Groupe> groupes =  groupeService.listAll();
	       
	        return new ResponseEntity<>(groupes, HttpStatus.OK);
	    }

	    @GetMapping("/groupe/find/{id}")
	    public ResponseEntity<Groupe> getAdminById (@PathVariable("id") int id) {
	        Groupe admin = groupeService.getGroupe(id);
	        return new ResponseEntity<>(admin, HttpStatus.OK);
	    }

	    @PostMapping("/groupe/add")
	    public ResponseEntity<Groupe> addAdmin(@RequestBody Groupe admin) {
	        Groupe newAdmin = groupeService.save(admin);
	        return new ResponseEntity<>(newAdmin, HttpStatus.CREATED);
	    }

	    @PutMapping("/groupe/update")
	    public ResponseEntity<Groupe> updateAdmin(@RequestBody Groupe admin) {
	        Groupe updateAdmin = groupeService.updateAdminByGroupe(admin);
	        return new ResponseEntity<>(updateAdmin, HttpStatus.OK);
	    }

	    @DeleteMapping("/groupe/delete/{id}")
	    public ResponseEntity<?> deleteAdmin(@PathVariable("id") int id) {
	    	groupeService.delete(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
	   

}
