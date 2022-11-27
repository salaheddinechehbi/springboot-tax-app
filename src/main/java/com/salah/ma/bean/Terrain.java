package com.salah.ma.bean;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Terrain {

	@Id @GeneratedValue
	private int id;
	private String ref;
	private Double surface;
	@ManyToOne
	private Categorie categorie;
	@ManyToOne
	private Redevable redevable;
	@ManyToOne
	private Quartier quartier;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Double getSurface() {
		return surface;
	}

	public void setSurface(Double surface) {
		this.surface = surface;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Redevable getRedevable() {
		return redevable;
	}

	public void setRedevable(Redevable redevable) {
		this.redevable = redevable;
	}

	public Quartier getQuartier() {
		return quartier;
	}

	public void setQuartier(Quartier quartier) {
		this.quartier = quartier;
	}

	@Override
	public String toString() {
		return "Terrain{" +
				"id=" + id +
				", ref='" + ref + '\'' +
				", surface='" + surface + '\'' +
				", categorie=" + categorie +
				", redevable=" + redevable +
				", quartier=" + quartier +
				'}';
	}
}
