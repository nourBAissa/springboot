package com.example.produits.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.produits.entities.Auteur;
import com.example.produits.entities.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long>{
	List<Livre> findByNomProduit(String nom);
	List<Livre> findByNomProduitContains(String nom);
	@Query("select p from Livre p where p.nomProduit like %:nom and p.prixProduit > :prix")
	List<Livre> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	@Query("select p from Livre p where p.auteur = ?1")
	List<Livre> findByAuteur (Auteur auteur);
	List<Livre> findByAuteurId(Long id);
	List<Livre> findByOrderByNomProduitAsc();
	@Query("select p from Livre p order by p.nomProduit ASC, p.prixProduit DESC")
	List<Livre> trierProduitsNomsPrix ();
	
}
