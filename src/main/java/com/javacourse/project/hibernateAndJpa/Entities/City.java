package com.javacourse.project.hibernateAndJpa.Entities;
import javax.persistence.*;
@Entity
@Table(name="city")
public class City {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="country")
	private String country;
	public City(int id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}
	
	public City() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
