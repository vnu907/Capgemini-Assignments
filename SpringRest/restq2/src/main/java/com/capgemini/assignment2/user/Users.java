package com.capgemini.assignment2.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
	
	@Id
	private String userName;
	private String userPass;
	
	public Users(String userName, String userPass) {
		super();
		this.userName = userName;
		this.userPass = userPass;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	

}
