package org.fasttrackit.schoolmanagementsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 5128394030737937840L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
