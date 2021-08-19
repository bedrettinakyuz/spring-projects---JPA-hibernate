package com.javacourse.project.hibernateAndJpa.Entities;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name="city")
public class City {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long  id;
	@Column(name="name")
	private String name;
	@Column(name="country")
	private String country;


	



	public City() {}
	
	
	public City(String name, String country) {
		
		this.name = name;
		this.country = country;
	}




	public Long  getId() {
		return id;
	}
	public void setId(Long id) {
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
