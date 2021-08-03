package com.crudapp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapp.main.model.Person;

public interface PersonRepository extends JpaRepository<Person,Integer> {

}
