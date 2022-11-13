package com.salah.ma.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TaxTnb {

    @Id  @GeneratedValue
    private long id;

    @OneToOne
    private Categorie categorie;
    @OneToOne
    private Terrain terrain;
    @OneToOne
    private Redevable redevable;
    @OneToOne
private TauxTnb tauxTnb;
private double mtTotal;

    public TaxTnb( Terrain terrain, Redevable redevable, TauxTnb tauxTnb, double mtTotal) {
        this.terrain = terrain;
        this.redevable = redevable;
        this.tauxTnb = tauxTnb;
        this.mtTotal = mtTotal;
    }

    public TaxTnb() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public TauxTnb getTauxTnb() {
        return tauxTnb;
    }

    public void setTauxTnb(TauxTnb tauxTnb) {
        this.tauxTnb = tauxTnb;
    }

    public double getMtTotal() {
        return mtTotal;
    }

    public void setMtTotal(double mtTotal) {
        this.mtTotal = mtTotal;
    }
}
