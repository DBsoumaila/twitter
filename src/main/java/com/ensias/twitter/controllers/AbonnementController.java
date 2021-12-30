package com.ensias.twitter.controllers;

import java.util.List;

import com.ensias.twitter.model.users.Abonnement;
import com.ensias.twitter.service.AbonementService;
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
@RequestMapping(name="/abonnement")
public class AbonnementController {

	
	@Autowired
	private AbonementService abonnementService;
	
	 @GetMapping("/abonnement/all")
	    public ResponseEntity<List<Abonnement> > getAllabonnements() {
		 
		  List<Abonnement> abonnements =  abonnementService.listAll();
	       
	        return new ResponseEntity<>(abonnements, HttpStatus.OK);
	    }

	    @GetMapping("/abonnement/find/{id}")
	    public ResponseEntity<Abonnement> getAdminById (@PathVariable("id") int id) {
	    	Abonnement admin = abonnementService.getabonnement(id);
	        return new ResponseEntity<>(admin, HttpStatus.OK);
	    }

	    @PostMapping("/abonnement/add")
	    public ResponseEntity<Abonnement> addAdmin(@RequestBody Abonnement admin) {
	    	Abonnement newAdmin = abonnementService.save(admin);
	        return new ResponseEntity<>(newAdmin, HttpStatus.CREATED);
	    }

	    @PutMapping("/abonnement/update")
	    public ResponseEntity<Abonnement> updateAdmin(@RequestBody Abonnement admin) {
	    	Abonnement updateAdmin = abonnementService.updateAdminByabonnement(admin);
	        return new ResponseEntity<>(updateAdmin, HttpStatus.OK);
	    }

	    @DeleteMapping("/abonnement/delete/{id}")
	    public ResponseEntity<?> deleteAdmin(@PathVariable("id") int id) {
	    	abonnementService.delete(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
	   

}
