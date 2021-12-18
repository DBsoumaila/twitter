package com.bar.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bar.demo.exception.UserNotFoundException;
import com.bar.demo.model.Produit;
import com.bar.demo.repo.ProduitRepo;




@Service
@Transactional
public class ProduitService {
	@Autowired
	private ProduitRepo repoAdmin;
	
	public List <Produit> listAll() {
		return repoAdmin.findAll();
	}
	
	public Produit save(Produit admin) {
		return repoAdmin.save(admin);
	}
	
	public Produit getProduit(int id) {
		return repoAdmin.findById(id).orElseThrow(() -> new UserNotFoundException("Produit avec " + id + " N'existe pas"));
	}
	
	public void delete(int id) {
		repoAdmin.deleteById(id);
	}
	//update by produit
	 public Produit updateAdminByProduct(Produit admin) {
	        return repoAdmin.save(admin);
	 }
	 
	 public List<Produit> findByNameLike(String recherche)
	 {
		 return repoAdmin.findByNomLike(recherche);
	 }
	 
	 //update by id
//	 public Produit updateAdminById(int id) {
//	        return repoAdmin.save(Product());
//	 }
	

}
