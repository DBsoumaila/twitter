package com.ensias.twitter.repo.notifications;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensias.twitter.model.notifications.Notification;


@Repository
public interface NotificationRepo extends JpaRepository <Notification,Integer> {
	
	
	
	
   // @Query("SELECT id, notification, date, nom, prenom FROM Notification a,Utilisateur u WHERE a.id=u.id ")
    

}
