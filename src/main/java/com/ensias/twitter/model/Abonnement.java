package com.ensias.twitter.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="Abonnement")
public class Abonnement implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id",nullable = false, updatable = false)
	private int id;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	private String nom;
	private String date;
	public Abonnement(int id, String nom, String date) {
		super();
		this.id = id;
		this.nom = nom;
		this.date = date;
	}
	public Abonnement(String nom, String date) {
		super();
		this.nom = nom;
		this.date = date;
	}
	public Abonnement() {
		super();
	}
	

}