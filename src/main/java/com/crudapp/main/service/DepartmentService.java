package com.crudapp.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crudapp.main.model.Department;

@Service
public interface DepartmentService {
 
	List<Department> getAlldept();
	Department savedept(Department dept);
	Department getBydeptid(Integer did);
	void delete(Integer did);
}
