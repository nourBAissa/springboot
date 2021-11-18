package com.example.produits.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.produits.entities.Auteur;
import com.example.produits.entities.Livre;
import com.example.produits.repos.LivreRepository;

@Service
public class LivreServiceImpl {
	@Autowired
	LivreRepository livreRepository;
	
	
	public Livre saveProduit(Livre p) {
	 return livreRepository.save(p);
	}
	
	 public Livre updateProduit(Livre p) {
	 return livreRepository.save(p);
	 }
	 
	 public void deleteProduit(Livre p) {
		 livreRepository.delete(p);
	 }
	 
	 public void deleteProduitById(Long id) {
		 livreRepository.deleteById(id);
	 }
	
	 public Livre getProduit(Long id) {
	 return livreRepository.findById(id).get();
	 }
	 
	 public List<Livre> getAllProduits() {
	 return livreRepository.findAll();
	 }
	 
	
	 public List<Livre> findByNomProduit(String nom) {
	 return livreRepository.findByNomProduit(nom);
	 }
	
	 public List<Livre> findByNomProduitContains(String nom) {
	 return livreRepository.findByNomProduitContains(nom);
	 }
	 
	 public List<Livre> findByNomPrix(String nom, Double prix) {
		 return livreRepository.findByNomPrix(nom, prix);
	 }
	 
	 public List<Livre> findByCategorie(Auteur auteur) {
	 return livreRepository.findByAuteur(auteur);
	 }
	 
	 public List<Livre> findByCategorieIdCat(Long id) {
	 return livreRepository.findByAuteurId(id);
	 }
	 
	 public List<Livre> findByOrderByNomProduitAsc() {
	 return livreRepository.findByOrderByNomProduitAsc();
	 }
	 
	 public List<Livre> trierProduitsNomsPrix() {
	 return livreRepository.trierProduitsNomsPrix();
	 }
	 }

