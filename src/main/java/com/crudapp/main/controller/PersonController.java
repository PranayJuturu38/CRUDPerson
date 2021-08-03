package com.crudapp.main.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudapp.main.service.PersonService;
import com.crudapp.main.model.Person;
@RestController
public class PersonController {
 
	@Autowired
	private PersonService service;
	
	@GetMapping("/users")
	public List<Person> list(){
		return service.listAll();
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<Person> get(@PathVariable Integer id) {
	    try {
	        Person person = service.get(id);
	        return new ResponseEntity<Person>(person, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
	    }     
	    
	}
	
	@PostMapping("/users")
	public void add(@RequestBody Person person) {
		service.save(person);
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<?> update(@RequestBody Person person, @PathVariable Integer id) {
	    try {
	        Person existingPerson = service.get(id);
	        service.save(person);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable Integer id) {
	    service.delete(id);
	}
	
	
}
