package com.salah.ma.bean;

import javax.persistence.*;

@Entity
public class TauxTnb {
    @Id @GeneratedValue
    private Long id;
    @ManyToOne
    private Categorie categorie;
    private int surfaceMin;
    private int surfaceMax;
    private double mtParMetre;
    private int annee;

    public TauxTnb() {
    }

    public TauxTnb( Categorie categorie, int surfaceMin, int surfaceMax, double mtParMetre) {
        this.categorie = categorie;
        this.surfaceMin = surfaceMin;
        this.surfaceMax = surfaceMax;
        this.mtParMetre = mtParMetre;
        this.annee = annee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public int getSurfaceMin() {
        return surfaceMin;
    }

    public void setSurfaceMin(int surfaceMin) {
        this.surfaceMin = surfaceMin;
    }

    public int getSurfaceMax() {
        return surfaceMax;
    }

    public void setSurfaceMax(int surfaceMax) {
        this.surfaceMax = surfaceMax;
    }

    public double getMtParMetre() {
        return mtParMetre;
    }

    public void setMtParMetre(double mtParMetre) {
        this.mtParMetre = mtParMetre;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
}
