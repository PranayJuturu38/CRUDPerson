package com.crudapp.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapp.main.model.Person;
import com.crudapp.main.repository.PersonRepository;

@Service
@Transactional
public class PersonService {
    @Autowired
    private PersonRepository repo;
    
    public List<Person> listAll(){
    	return repo.findAll();
    }
    
    public void save(Person person) {
    	repo.save(person);
    }
    
    public Person get(Integer id) {
    	return repo.findById(id).get();
    }
    
    public void delete(Integer id) {
    	repo.deleteById(id);
    }
}
