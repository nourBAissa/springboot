package com.example.produits.service;
import java.util.List;

import com.example.produits.entities.Auteur;
import com.example.produits.entities.Livre;
public interface LivreService {
	Livre saveProduit(Livre p);
	Livre updateProduit(Livre p);
	void deleteProduit(Livre p);
	void deleteProduitById(Long id);
	Livre getProduit(Long id);
	List<Livre> getAllProduits();
	List<Livre> findByNomProduit(String nom);
	List<Livre> findByNomProduitContains(String nom);
	List<Livre> findByNomPrix (String nom, Double prix);
	List<Livre> findByAuteur (Auteur auteur);
	List<Livre> findByAuteurId(Long id);
	List<Livre> findByOrderByNomProduitAsc();
	List<Livre> trierProduitsNomsPrix();
}
