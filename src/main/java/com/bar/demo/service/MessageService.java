package com.bar.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bar.demo.exception.UserNotFoundException;
import com.bar.demo.model.Message;
import com.bar.demo.repo.MessageRepo;
import com.bar.demo.model.Message;





@Service
@Transactional
public class MessageService {
	@Autowired
	private MessageRepo messageRepo;
	
	public List <Message> listAll() {
		return messageRepo.findAll();
	}
	
	public Message save(Message admin) {
		return messageRepo.save(admin);
	}
	
	public Message getMessage(int id) {
		return messageRepo.findById(id).orElseThrow(() -> new UserNotFoundException("Messages avec " + id + " N'existe pas"));
	}
	
	public void delete(int id) {
		messageRepo.deleteById(id);
	}
	//update by Message
	 public Message updateAdminByMessage(Message admin) {
	        return messageRepo.save(admin);
	 }
	 
	
	 
	 //micro service de suivie
	 //service d'abonnement
//	 public Message updateAdminById(int id) {
//	        return repoAdmin.save(Product());
//	 }
	

}
