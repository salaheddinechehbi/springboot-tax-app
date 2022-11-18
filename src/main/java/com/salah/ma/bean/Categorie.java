package com.salah.ma.bean;

import javax.persistence.*;

@Entity
//@Table(name = "categorie_data")
//@Data @NoArgsConstructor @AllArgsConstructor @ToString lombook
// NamedQuery(name="User.findByLogin", query="select u from User u where u.login = :login")
// User findByLogin(@Param("login") String login);
public class Categorie {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "label")
	private String label;
	@Column(name = "code")
	private String code;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Categorie{" +
				"id=" + id +
				", label='" + label + '\'' +
				'}';
	}
}
