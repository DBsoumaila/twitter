package com.ensias.twitter.service;

import java.util.List;

import com.ensias.twitter.model.notifications.Notification;
import com.ensias.twitter.repo.notifications.NotificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensias.twitter.exception.UserNotFoundException;


@Service
@Transactional
public class NotificationService {
	@Autowired
	private NotificationRepo repoAdmin;
	
	public List <Notification> listAll() {
		return repoAdmin.findAll();
	}
	
	public Notification save(Notification admin) {
		return repoAdmin.save(admin);
	}
	
	public Notification getNotification(int id) {
		return repoAdmin.findById(id).orElseThrow(() -> new UserNotFoundException("NOTIfication avec " + id + " N'existe pas"));
	}
	
	public void delete(int id) {
		repoAdmin.deleteById(id);
	}
	//update by Utilisateur
	 public Notification updateAdminByUtilisateur(Notification admin) {
	        return repoAdmin.save(admin);
	 }
	 

		 
	
	 
	 //micro service de suivie
	 //service d'abonnement
//	 public Utilisateur updateAdminById(int id) {
//	        return repoAdmin.save(Product());
//	 }
	

}
