package com.crudapp.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapp.main.model.Department;
import com.crudapp.main.repository.Departmentrepository;
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private Departmentrepository deptrepo;
	@Override
	public List<Department> getAlldept() {
		// TODO Auto-generated method stub
		return deptrepo.findAll();
	}

	@Override
	public Department savedept(Department dept) {
		// TODO Auto-generated method stub
		return deptrepo.save(dept);
	}

	@Override
	public Department getBydeptid(Integer did) {
		// TODO Auto-generated method stub
		return deptrepo.getById(did);
	}

	@Override
	public void delete(Integer did) {
		// TODO Auto-generated method stub
		deptrepo.deleteById(did);
	}
	

}
