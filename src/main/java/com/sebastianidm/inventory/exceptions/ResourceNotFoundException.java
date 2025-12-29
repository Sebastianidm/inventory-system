package com.sebastianidm.inventory.exceptions;

public class ResourceNotFoundException extends RuntimeException {


    public ResourceNotFoundException(String message) {
        super(message);
    }
}
