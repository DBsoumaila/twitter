package com.ensias.twitter.repo.users;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensias.twitter.model.users.Utilisateur;

import java.util.Optional;


@Repository
public interface UtilisateurRepo extends JpaRepository <Utilisateur,Integer>{

    Optional<Utilisateur> findByEmail(String email);
    Optional<Utilisateur> findByUsername(String username);
}
