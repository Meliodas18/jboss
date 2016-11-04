/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

/**
 *
 * @author huang
 */



import java.util.Date;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class SessionDvd {
    
    @PersistenceContext
    private EntityManager em;
    
    
    public void ajoutedvd(String titre, float prix, Date date, int quantite){
      DVD dvd= new DVD(titre, prix, date, quantite);
      em.persist(dvd);  
    }
    
    public void ajoutAuteur(String nom, String prenom){
        Auteur auteur = new Auteur(nom,prenom);
        em.persist(auteur);
    }
    
    public void ajoutRealisateur(String nom, String prenom){
        Realisateur realisateur = new Realisateur(nom,prenom);
        em.persist(realisateur);
    }
}

