package com.bar.demo.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bar.demo.model.Produit;


@Repository
public interface ProduitRepo extends JpaRepository <Produit,Integer>{
	List<Produit> findByNomLike(String recherche);
	

}
