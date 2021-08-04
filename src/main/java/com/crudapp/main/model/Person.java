package com.crudapp.main.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="person")
public class Person {
	private Integer id;
	private String personname;
	private String password;
	private String email;
	
//	@OneToMany(mappedBy="person",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//	private List<Department> dept; 
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
