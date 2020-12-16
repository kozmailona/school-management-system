package org.fasttrackit.schoolmanagementsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MarkNotFoundException extends Exception {

	private static final long serialVersionUID = -4734695179687268063L;

	public MarkNotFoundException(String message) {
		super(message);
	}

}
