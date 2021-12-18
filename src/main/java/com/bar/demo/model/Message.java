package com.bar.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Message {
	private int id;
	private String message;
	private Date dateDuMessage;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private Utilisateur sender;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Date getDateDuMessage() {
		return dateDuMessage;
	}


	public void setDateDuMessage(Date dateDuMessage) {
		this.dateDuMessage = dateDuMessage;
	}


	public Utilisateur getSender() {
		return sender;
	}


	public void setSender(Utilisateur sender) {
		this.sender = sender;
	}


	public Message(int id, String message, Date dateDuMessage, Utilisateur sender) {
		super();
		this.id = id;
		this.message = message;
		this.dateDuMessage = dateDuMessage;
		this.sender = sender;
	}


	public Message(String message, Date dateDuMessage, Utilisateur sender) {
		super();
		this.message = message;
		this.dateDuMessage = dateDuMessage;
		this.sender = sender;
	}


	public Message() {
		super();
	}
	
	

}
