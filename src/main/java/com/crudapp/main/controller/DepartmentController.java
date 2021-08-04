package com.crudapp.main.controller;

import java.util.List;

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

import com.crudapp.main.exception.DepartmentException;
import com.crudapp.main.exception.PersonException;
import com.crudapp.main.model.Department;
import com.crudapp.main.model.Person;
import com.crudapp.main.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService deptservice;
	
	@GetMapping("/departments")
	public List<Department> list(){
		return deptservice.getAlldept();
	}
	
	@GetMapping("/departments/{did}")
	public ResponseEntity<Department> get(@PathVariable Integer did) throws Exception {
	    try {
	        Department dept = deptservice.getBydeptid(did);
	        return new ResponseEntity<Department>(dept, HttpStatus.OK);
	        
	    } catch (DepartmentException deptException) {
	        System.out.print(deptException);
	    	return new ResponseEntity<Department>(HttpStatus.NOT_FOUND);
	    }     
	  
	}
	
	@PostMapping("/departments")
	public void add(@RequestBody Department dept ) throws Exception{
		try{
			deptservice.savedept(dept);
		}catch(DepartmentException deptException)
		
		{
			throw new DepartmentException (deptException);
		}
	 
	
	}
	
	@PutMapping("/departments/{did}")
	public ResponseEntity<?> update(@RequestBody Department dept, @PathVariable Integer did) throws Exception{
	    try {
	        Department existingdept = deptservice.getBydeptid(did);
	        deptservice.savedept(dept);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (DepartmentException deptException) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@DeleteMapping("/departments/{did}")
	public void delete(@PathVariable Integer did) throws Exception{
	    try {
		deptservice.delete(did);
	}catch(DepartmentException deptException) {
		throw new DepartmentException (deptException);
	}
	}
	
}
