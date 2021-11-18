package com.example.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.produits.entities.Auteur;
import com.example.produits.entities.Livre;
import com.example.produits.repos.LivreRepository;

@SpringBootTest
class ProduitsApplicationTests {
@Autowired
private LivreRepository livreRepository;
@Test
public void testCreateProduit() {
Livre prod = new Livre("the name of this book is secret",28.500,new Date());
livreRepository.save(prod);
}
@Test
public void testFindProduit()
{
Livre p = livreRepository.findById(1L).get();

System.out.println(p);
}
@Test
public void testUpdateProduit()
{
Livre p = livreRepository.findById(1L).get();
p.setPrixProduit(31.0);
livreRepository.save(p);
}
@Test
public void testDeleteProduit()
{
livreRepository.deleteById(1L);;
}
@Test
public void testListerTousProduits()
{
List<Livre> prods = livreRepository.findAll();
for (Livre p : prods)
{
System.out.println(p);
}
}
@Test
public void testFindByNomProduit()
{
List<Livre> prods = livreRepository.findByNomProduit("the name of this book is secret");

for (Livre p : prods)
{
System.out.println(p);
}

}
@Test
public void testFindByNomProduitContains ()
{
List<Livre> prods=livreRepository.findByNomProduitContains("iphone X");

for (Livre p : prods)
{
System.out.println(p);
} }
@Test
public void testfindByNomPrix()
{
List<Livre> prods = livreRepository.findByNomPrix("the name of this book is secret", 31.0);
for (Livre p : prods)
{
System.out.println(p);
}

}
@Test
public void testfindByAuteur()
{
Auteur cat = new Auteur();
cat.setId(1L);
List<Livre> prods = livreRepository.findByAuteur(cat);
for (Livre p : prods)
{
System.out.println(p);
}

}
@Test
public void findByAuteurId()
{
List<Livre> prods = livreRepository.findByAuteurId(1L);
for (Livre p : prods)
{
System.out.println(p);
}

}
@Test
public void testfindByOrderByNomProduitAsc()
{
List<Livre> prods = livreRepository.findByOrderByNomProduitAsc();
for (Livre p : prods)
{
System.out.println(p);
}

}
@Test
public void testTrierProduitsNomsPrix()
{
List<Livre> prods = livreRepository.trierProduitsNomsPrix();
for (Livre p : prods)
{
System.out.println(p);
}

}
}