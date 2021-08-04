package com.crudapp.main.repository;




import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crudapp.main.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
	

//	@Query("SELECT p FROM Person p WHERE LOWER(p.personname) = LOWER(:lowerName)")
//	public Person getByName(@Param("personname") String name);

}
