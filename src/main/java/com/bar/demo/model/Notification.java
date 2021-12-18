package com.bar.demo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="Notification")

public class Notification implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idnotif", updatable = false,insertable=false)
	private int idnotif;
	private String notification;
	private String date; 
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private Utilisateur user;
	
	
	
	
	
	public int getIdnotif() {
		return idnotif;
	}



	public void setIdnotif(int idnotif) {
		this.idnotif = idnotif;
	}



	public String getNotification() {
		return notification;
	}



	public void setNotification(String notification) {
		this.notification = notification;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public Utilisateur getUser() {
		return user;
	}



	public void setUser(Utilisateur user) {
		this.user = user;
	}



	public Notification() {
		super();
	}



	public Notification(int idnotif, String notification, String date, Utilisateur user) {
		super();
		this.idnotif = idnotif;
		this.notification = notification;
		this.date = date;
		this.user = user;
	}



	public Notification(String notification, String date, Utilisateur user) {
		super();
		this.notification = notification;
		this.date = date;
		this.user = user;
	}

	
	
	}

	