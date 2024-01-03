package com.eazybytes.exception.custom;

public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super();
    }

    public InvalidAgeException(String message) {
        super(message);
    }

}
