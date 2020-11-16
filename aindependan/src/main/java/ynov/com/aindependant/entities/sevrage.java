package ynov.com.aindependant.entities;

import  javax.persistence.Entity;
import  javax.persistence.GeneratedValue;
import  javax.persistence.Id;
import java.util.Date;

@Entity
public class sevrage {
    @Id
    @GeneratedValue
    private  long id;
    private  String nom;
    private Date dateDebut;

    protected sevrage(){}
    public sevrage(String nom, Date dateDebut) {
        this.nom = nom;
        this.dateDebut = dateDebut;
    }

    public long getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public Date getDatedebut(){
        return dateDebut;
    }

    public void setDate(Date value) { dateDebut = value;}

}
