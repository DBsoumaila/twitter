package com.ensias.twitter.model.users;

import com.ensias.twitter.model.messages.Groupe;
import com.ensias.twitter.model.messages.Message;
import com.ensias.twitter.model.notifications.Notification;
import com.ensias.twitter.model.tweets.Bookmark;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Utilisateur")
public class Utilisateur implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id",nullable = false, updatable = false)
	private int id;

	@Column(nullable = false)
	private String nom;

	@Column(nullable = false)
	private String prenom;

	@Column(nullable = false, unique = true)
	private String email;

    @Column(nullable = false, unique = true)
    private String username;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private Date joinedAt;

	//les notification de l'utilisateur	
	@OneToMany(cascade = CascadeType.ALL, mappedBy= "user")
    private List<Notification> notifications = new ArrayList<>();
	
	//mapper les messages
	@OneToMany(cascade = CascadeType.ALL, mappedBy= "sender")
    private List<Message> messages = new ArrayList<>();
	
	//Mapping avec les groupes
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name ="user_groupe",
	            joinColumns = { @JoinColumn(name ="user_fk") },
	            inverseJoinColumns = { @JoinColumn(name = "group_fk") })

	private Set<Groupe> groupes = new HashSet<>();

	@OneToMany(mappedBy = "user")
	private Collection<Bookmark> bookmarks = new ArrayList<>();

	@OneToMany(mappedBy = "user")
	private Collection<Search> searches = new ArrayList<>();

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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Set<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(Set<Groupe> groupes) {
		this.groupes = groupes;
	}

	public Date getJoinedAt() {
		return joinedAt;
	}

	public void setJoinedAt(Date joinedAt) {
		this.joinedAt = joinedAt;
	}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Collection<Bookmark> getBookmarks() {
        return bookmarks;
    }

    public void setBookmarks(Collection<Bookmark> bookmarks) {
        this.bookmarks = bookmarks;
    }

    public Collection<Search> getSearches() {
        return searches;
    }

    public void setSearches(Collection<Search> searches) {
        this.searches = searches;
    }

    public Utilisateur(int id, String nom, String prenom, String email, String password,
                       List<Notification> notifications, List<Message> messages, Set<Groupe> groupes) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.notifications = notifications;
		this.messages = messages;
		this.groupes = groupes;
	}

	public Utilisateur(String nom, String prenom, String email, String password, List<Notification> notifications,
			List<Message> messages, Set<Groupe> groupes) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.notifications = notifications;
		this.messages = messages;
		this.groupes = groupes;
	}

	public Utilisateur() {
		super();
	}
	  
	  
	

	
}
