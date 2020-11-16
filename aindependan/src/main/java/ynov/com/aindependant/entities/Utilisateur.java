package ynov.com.aindependant.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class Utilisateur {
    @Id
    @GeneratedValue
    private  long id;
    private  String nom;

    protected Utilisateur(){}
    public Utilisateur(String nom) {
        this.nom = nom;
    }

    public long getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
}
