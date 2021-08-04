package com.crudapp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crudapp.main.model.Department; 
public interface Departmentrepository extends JpaRepository<Department,Integer> {

}
