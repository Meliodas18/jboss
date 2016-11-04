/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author huang
 */
@Entity
public class DVD implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre; 
    private float prix; 
    
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE")
    private java.util.Date date;
    
    private int quantite; 
    
    @ManyToOne
    private Auteur auteur;
    
    @ManyToOne
    private Realisateur realisateur;
    
    public DVD (String titre, float prix, Date date, int quantite ) {
        this.titre = titre; 
        this.prix = prix;
        this.date = date;
        this.quantite = quantite;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public Realisateur getRealisateur() {
        return realisateur;
    }
    
    
    
    public String getTitre(){
        return titre; 
    }


    public float getPrix() {
        return prix;
    }

    public Date getDate() {
        return date;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DVD)) {
            return false;
        }
        DVD other = (DVD) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.DVD[ id=" + id + " ]";
    }
    
}
