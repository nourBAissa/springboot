package com.nadhem.example.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.produits.entities.Livre;
import com.example.produits.service.LivreService;


	@RestController
	@RequestMapping("/api")
	@CrossOrigin
	public class ProduitRESTController {
	@Autowired
	LivreService livreService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Livre> getAllProduits() {
	return livreService.getAllProduits();
	}
	
	}

