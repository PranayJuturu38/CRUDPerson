package com.crudapp.main.exception;

import com.sun.istack.NotNull;

public class DepartmentException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	public DepartmentException (@NotNull final String message) {
		super(message);
	}
	public DepartmentException(DepartmentException deptException) {
		super(deptException);
	}
}
