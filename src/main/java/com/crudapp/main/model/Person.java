package com.crudapp.main.model;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Person {
	private Integer id;
	private String personname;
	private String password;
	private String email;
	
	public Person() {
		
	}

	public Person(Integer id,String personname,String password,String email) {
		this.id = id;
		this.personname = personname;
		this.password = password;
		this.email = email;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getid() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	public String getpersonname() {
		return personname;
	}
	public void setpersonname(String personname) {
		this.personname = personname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
