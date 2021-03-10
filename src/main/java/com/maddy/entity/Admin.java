package com.maddy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Admin {
	
	@Id
	@Column(name="adminid", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String adminId;
	

	@Column(name="username")
	@Size(min = 5, max = 10, message = "The username must be between {min} and to {max} characters")
	@NotEmpty
	@NotBlank
	private String userName;
	
	@Column(name="password")
	@Size(min = 8, max = 65, message = "The password must be between {min} and to {max} characters")
	@NotEmpty
	@NotBlank
	private String password;
	
	public Admin() {
		
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
	

}
