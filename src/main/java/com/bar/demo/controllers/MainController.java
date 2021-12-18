package com.bar.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bar.demo.model.Produit;
import com.bar.demo.service.ProduitService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
@RequestMapping(name="/")
public class MainController {

	
	@Autowired
	private ProduitService produitService;
	
	 @GetMapping("/produits")
	    public ResponseEntity<List<Produit> > getAllProducts() {
		 
		  List<Produit> produits =  produitService.listAll();
	       
	        return new ResponseEntity<>(produits, HttpStatus.OK);
	    }

	    @GetMapping("/produit/find/{id}")
	    public ResponseEntity<Produit> getAdminById (@PathVariable("id") int id) {
	        Produit admin = produitService.getProduit(id);
	        return new ResponseEntity<>(admin, HttpStatus.OK);
	    }

	    @PostMapping("/produit/add")
	    public ResponseEntity<Produit> addAdmin(@RequestBody Produit admin) {
	        Produit newAdmin = produitService.save(admin);
	        return new ResponseEntity<>(newAdmin, HttpStatus.CREATED);
	    }

	    @PutMapping("/produit/update")
	    public ResponseEntity<Produit> updateAdmin(@RequestBody Produit admin) {
	        Produit updateAdmin = produitService.updateAdminByProduct(admin);
	        return new ResponseEntity<>(updateAdmin, HttpStatus.OK);
	    }

	    @DeleteMapping("/admin/delete/{id}")
	    public ResponseEntity<?> deleteAdmin(@PathVariable("id") int id) {
	    	produitService.delete(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
	    @GetMapping("/produits/{recherche}")
	    public List<Produit> testeDeRequetes(@PathVariable String recherche) {
	        return produitService.findByNameLike("%"+recherche+"%");
	    }

}
