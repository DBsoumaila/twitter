package com.ensias.twitter.controllers;

import java.util.List;

import com.ensias.twitter.model.Notification;
import com.ensias.twitter.service.NotificationService;
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
@RequestMapping(name="/notif")
public class NotificationController {

	
	@Autowired
	private NotificationService utilisateurService;
	
	 @GetMapping("/notif/all")
	    public ResponseEntity<List<Notification> > getAllNotifs() {
		 
		  List<Notification> utilisateurs =  utilisateurService.listAll();
	       
	        return new ResponseEntity<>(utilisateurs, HttpStatus.OK);
	    }
	

	    @GetMapping("/notif/find/{id}")
	    public ResponseEntity<Notification> getAdminById (@PathVariable("id") int id) {
	        Notification admin = utilisateurService.getNotification(id);
	        return new ResponseEntity<>(admin, HttpStatus.OK);
	    }

	    @PostMapping("/notif/add")
	    public ResponseEntity<Notification> addAdmin(@RequestBody Notification admin) {
	        Notification newAdmin = utilisateurService.save(admin);
	        return new ResponseEntity<>(newAdmin, HttpStatus.CREATED);
	    }

	    @PutMapping("/notif/update")
	    public ResponseEntity<Notification> updateAdmin(@RequestBody Notification admin) {
	    	Notification updateAdmin = utilisateurService.updateAdminByUtilisateur(admin);
	        return new ResponseEntity<>(updateAdmin, HttpStatus.OK);
	    }

	    @DeleteMapping("/notif/delete/{id}")
	    public ResponseEntity<?> deleteAdmin(@PathVariable("id") int id) {
	    	utilisateurService.delete(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
	   

}
