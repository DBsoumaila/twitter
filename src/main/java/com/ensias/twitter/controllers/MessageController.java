package com.ensias.twitter.controllers;

import java.util.List;

import com.ensias.twitter.model.Message;
import com.ensias.twitter.service.MessageService;
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
@RequestMapping(name="/message")
public class MessageController {

	
	@Autowired
	private MessageService messageService;
	
	 @GetMapping("/message/all")
	    public ResponseEntity<List<Message> > getAllmessages() {
		 
		  List<Message> messages =  messageService.listAll();
	       
	        return new ResponseEntity<>(messages, HttpStatus.OK);
	    }

	    @GetMapping("/message/find/{id}")
	    public ResponseEntity<Message> getAdminById (@PathVariable("id") int id) {
	    	Message admin = messageService.getMessage(id);
	        return new ResponseEntity<>(admin, HttpStatus.OK);
	    }

	    @PostMapping("/message/add")
	    public ResponseEntity<Message> addAdmin(@RequestBody Message admin) {
	    	Message newAdmin = messageService.save(admin);
	        return new ResponseEntity<>(newAdmin, HttpStatus.CREATED);
	    }

	    @PutMapping("/message/update")
	    public ResponseEntity<Message> updateAdmin(@RequestBody Message admin) {
	    	Message updateAdmin = messageService.updateAdminByMessage(admin);
	        return new ResponseEntity<>(updateAdmin, HttpStatus.OK);
	    }

	    @DeleteMapping("/message/delete/{id}")
	    public ResponseEntity<?> deleteAdmin(@PathVariable("id") int id) {
	    	messageService.delete(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
	   

}
