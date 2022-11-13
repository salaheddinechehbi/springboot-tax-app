package com.salah.ma.bean;

import javax.persistence.*;

@Entity
public class Categorie {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "libele")
	private String label;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "Categorie{" +
				"id=" + id +
				", label='" + label + '\'' +
				'}';
	}
}
