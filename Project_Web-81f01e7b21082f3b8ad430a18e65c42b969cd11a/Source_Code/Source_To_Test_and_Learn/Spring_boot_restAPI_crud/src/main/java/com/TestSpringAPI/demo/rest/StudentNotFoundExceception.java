package com.TestSpringAPI.demo.rest;

public class StudentNotFoundExceception extends RuntimeException {

    public StudentNotFoundExceception(String message) {
        super(message);
    }

    public StudentNotFoundExceception(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundExceception(Throwable cause) {
        super(cause);
    }
}
