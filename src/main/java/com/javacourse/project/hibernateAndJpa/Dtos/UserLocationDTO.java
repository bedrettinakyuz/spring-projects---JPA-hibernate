package com.javacourse.project.hibernateAndJpa.Dtos;

public class UserLocationDTO {
	
	private Long userID;
	private String fullName;
	private String city;
	private String country;
	
	
	public UserLocationDTO() {

	}
	public UserLocationDTO(Long userID, String fullName, String city, String country) {
		
		this.userID = userID;
		this.fullName = fullName;
		this.city = city;
		this.country = country;
	}
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
