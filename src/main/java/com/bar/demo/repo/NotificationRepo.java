package com.bar.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bar.demo.model.Notification;


@Repository
public interface NotificationRepo extends JpaRepository <Notification,Integer> {
	
	
	
	
   // @Query("SELECT id, notification, date, nom, prenom FROM Notification a,Utilisateur u WHERE a.id=u.id ")
    

}
