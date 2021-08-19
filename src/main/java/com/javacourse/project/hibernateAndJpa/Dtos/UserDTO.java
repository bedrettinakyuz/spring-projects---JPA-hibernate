package com.javacourse.project.hibernateAndJpa.Dtos;

public class UserDTO {

	private Long userID;
	private String firstName;
	private String lastName;
	private String email;
	private Long cityID;
	
	
	public UserDTO() {

	}


	public UserDTO(Long userID, String firstName, String lastName, String email, Long cityID) {
	
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.cityID = cityID;
	}


	public Long getUserID() {
		return userID;
	}


	public void setUserID(Long userID) {
		this.userID = userID;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getCityID() {
		return cityID;
	}


	public void setCityID(Long cityID) {
		this.cityID = cityID;
	}
	
	
	
}
