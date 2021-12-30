package com.ensias.twitter.model.messages;

import com.ensias.twitter.model.users.Utilisateur;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Table(name="Groupe")
@Entity
public class Groupe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id",nullable = false, updatable = false)
	private int idGroupe;
	private String nomDuGroupe;
	private Date dateCreation;
	
	//map avec les utilisateurs
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "groupes")
    private Set<Utilisateur> utilisateurs=new HashSet<>();

	public int getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}

	public String getNomDuGroupe() {
		return nomDuGroupe;
	}

	public void setNomDuGroupe(String nomDuGroupe) {
		this.nomDuGroupe = nomDuGroupe;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Set<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public Groupe(int idGroupe, String nomDuGroupe, Date dateCreation, Set<Utilisateur> utilisateurs) {
		super();
		this.idGroupe = idGroupe;
		this.nomDuGroupe = nomDuGroupe;
		this.dateCreation = dateCreation;
		this.utilisateurs = utilisateurs;
	}

	public Groupe(String nomDuGroupe, Date dateCreation, Set<Utilisateur> utilisateurs) {
		super();
		this.nomDuGroupe = nomDuGroupe;
		this.dateCreation = dateCreation;
		this.utilisateurs = utilisateurs;
	}

	public Groupe() {
		super();
	}
	
	

}
