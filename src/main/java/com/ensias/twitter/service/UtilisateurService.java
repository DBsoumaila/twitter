package com.ensias.twitter.service;

import java.util.Date;
import java.util.List;

import com.ensias.twitter.model.users.Utilisateur;
import com.ensias.twitter.repo.users.UtilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensias.twitter.exception.UserNotFoundException;


@Service
@Transactional
public class UtilisateurService {
	@Autowired
	private UtilisateurRepo repoUser;
	
	public List <Utilisateur> listAll() {
		return repoUser.findAll();
	}
	
	public Utilisateur save(Utilisateur user) {
		if(repoUser.findByEmail(user.getEmail()).isEmpty()) {
			user.setJoinedAt(new Date());
			return repoUser.save(user);
		}
		else
			throw new IllegalStateException("Utilisateur " + user.getEmail() + " existe déjà");
	}

	public Utilisateur login(String username, String password) {
		if(repoUser.findByUsername(username).isPresent()) {
			Utilisateur user = repoUser.findByUsername(username).get();
			if(user.getPassword().equals(password))
				return user;
			else
				throw new IllegalStateException("Wrong password");
		}
		else
			throw new IllegalStateException("User  @" + username + " not found");
	}
	
	public Utilisateur getUtilisateur(String username) {
		return repoUser.findByUsername(username).orElseThrow(() -> new UserNotFoundException("User  @" + username + " not found"));
	}
	
	public void delete(int id) {
		repoUser.deleteById(id);
	}

	//update by Utilisateur
	public Utilisateur updateUserByUtilisateur(Utilisateur user) {
		return repoUser.save(user);
	}
	 
	
	 
	 //micro service de suivie
	 //service d'abonnement
//	 public Utilisateur updateUserById(int id) {
//	        return repoUser.save(Product());
//	 }
	

}
