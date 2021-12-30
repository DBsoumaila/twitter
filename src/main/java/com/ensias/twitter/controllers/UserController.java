package com.ensias.twitter.controllers;

import java.util.List;

import com.ensias.twitter.model.users.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

	@GetMapping("/utilisateur/find/{username}")
	public ResponseEntity<Utilisateur> getAdminById (@PathVariable String username) {
		Utilisateur user = utilisateurService.getUtilisateur(username);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@PostMapping("/utilisateur/add")
	public ResponseEntity<?> addAdmin(@RequestBody Utilisateur user) {
		try {
			return ResponseEntity
					.status(HttpStatus.CREATED)
					.body(utilisateurService.save(user));
		}
		catch (IllegalStateException ex) {
			return ResponseEntity
					.status(HttpStatus.CONFLICT)
					.body("{\"error\":\"" + ex.getMessage() + "\"}");
		}
	}

	@GetMapping("/utilisateur/login")
	public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password) {
		try {
			return ResponseEntity
					.status(HttpStatus.CREATED)
					.body(utilisateurService.login(username, password));
		}
		catch (IllegalStateException ex) {
			return ResponseEntity
					.status(HttpStatus.NOT_FOUND)
					.body("{\"error\":\"" + ex.getMessage() + "\"}");
		}
	}

	@PutMapping("/utilisateur/update")
	public ResponseEntity<Utilisateur> updateAdmin(@RequestBody Utilisateur user) {
		Utilisateur updateAdmin = utilisateurService.updateUserByUtilisateur(user);
		return new ResponseEntity<>(updateAdmin, HttpStatus.OK);
	}

	@DeleteMapping("/utilisateur/delete/{id}")
	public ResponseEntity<?> deleteAdmin(@PathVariable("id") int id) {
		utilisateurService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
