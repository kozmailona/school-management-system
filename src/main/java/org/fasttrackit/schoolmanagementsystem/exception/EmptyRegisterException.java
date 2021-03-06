package org.fasttrackit.schoolmanagementsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmptyRegisterException extends Exception {

    private static final long serialVersionUID = -4982841983528229362L;

    public EmptyRegisterException(String message) {
        super(message);
    }

}
