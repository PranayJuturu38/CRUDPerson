 package com.crudapp.main.exception;

import com.sun.istack.NotNull;

public class PersonException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public PersonException (@NotNull final String message) {
		super(message);
	}
	public PersonException(PersonException personException) {
		super(personException);
	}
}
