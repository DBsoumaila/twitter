package com.ensias.twitter.controllers;

import java.util.List;

import com.ensias.twitter.model.Utilisateur;
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

import com.ensias.twitter.service.UtilisateurService;

@RestController
@RequestMapping(name="/utilisateur")
public class UserController {

	
	@Autowired
	private UtilisateurService utilisateurService;
	
	 @GetMapping("/utilisateur/all")
	 public ResponseEntity<List<Utilisateur> > getAllProducts() {
	 	List<Utilisateur> utilisateurs =  utilisateurService.listAll();
	       
	 	return new ResponseEntity<>(utilisateurs, HttpStatus.OK);
	 }

	@GetMapping("/utilisateur/find/{id}")
	public ResponseEntity<Utilisateur> getAdminById (@PathVariable("id") int id) {
		Utilisateur admin = utilisateurService.getUtilisateur(id);
		return new ResponseEntity<>(admin, HttpStatus.OK);
	}

	@PostMapping("/utilisateur/add")
	public ResponseEntity<Utilisateur> addAdmin(@RequestBody Utilisateur admin) {
		Utilisateur newAdmin = utilisateurService.save(admin);
		return new ResponseEntity<>(newAdmin, HttpStatus.CREATED);
	}

	@PutMapping("/utilisateur/update")
	public ResponseEntity<Utilisateur> updateAdmin(@RequestBody Utilisateur admin) {
		Utilisateur updateAdmin = utilisateurService.updateAdminByUtilisateur(admin);
		return new ResponseEntity<>(updateAdmin, HttpStatus.OK);
	}

	@DeleteMapping("/utilisateur/delete/{id}")
	public ResponseEntity<?> deleteAdmin(@PathVariable("id") int id) {
		utilisateurService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	   

}
