package com.project;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "Ciutada")
public class Ciutada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private long id;

    @Column(name = "ciutatId", nullable = false)
    private long ciutatId;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "cognom", nullable = false)
    private String cognom;

    @Column(name = "edat", nullable = false)
    private int edat;
    public Ciutada(){

    }

    public Ciutada(long ciutatId, String nom, String cognom, int edat){
        this.ciutatId = ciutatId;
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCiutatId() {
        return this.ciutatId;
    }

    public void setCiutatId(long ciutatId) {
        this.ciutatId = ciutatId;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return this.cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getEdat() {
        return this.edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }


    @Override
    public String toString() {
        return "    " +
            getCognom() +" "+ getCognom() + "," + getEdat() + " - " + getId();
    }
}