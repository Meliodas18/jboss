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
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@LocalBean
public class SessionDvd {
    
    @PersistenceContext
    private EntityManager em;
    
    
    
    public void ajoutedvd(String titre, float prix, Date date, int quantite, Realisateur realisateur, Auteur auteur ){
      DVD dvd= new DVD(titre, prix, date, quantite, realisateur,  auteur );
      em.persist(dvd); 
      
    }
    
    public Auteur rechercheAuteur(String nomAuteur, String prenomAuteur){
        
        Query queryAuteur = em.createQuery("Select from auteur where nom ="+ nomAuteur +" AND prenom = "+ prenomAuteur +"");
        try {
           return (Auteur) queryAuteur.getSingleResult();
           
        }catch(NoResultException e){
            Auteur auteur = new Auteur(nomAuteur, prenomAuteur) ;
            em.persist(auteur);
            return auteur;
        }catch(Exception e){
            
            return null;
        }       
    }
    
     public Realisateur rechercheRealisateur(String nom, String prenom){
        
        Query queryRealisateur = em.createQuery("Select from realisateur where nom ="+ nom +" AND prenom = "+ prenom +"");
        try {
           return (Realisateur) queryRealisateur.getSingleResult();
           
        }catch(NoResultException e){
            Realisateur realisateur = new Realisateur(nom, prenom) ;
            em.persist(realisateur);
            return realisateur;
        }catch(Exception e){
            
            return null;
        }       
    }
    
    
    public void ajoutAuteur(){
        Auteur auteur = new Auteur("Maillot","Franck");
        em.persist(auteur);
        em.flush();
        Auteur aut = (Auteur) em.find(Auteur.class, (long) 1);
        
        em.remove(aut);
    }
    
    public void ajoutRealisateur(String nom, String prenom){
        Realisateur realisateur = new Realisateur(nom,prenom);
        em.persist(realisateur);
    }
}

