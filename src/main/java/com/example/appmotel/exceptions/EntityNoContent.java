package com.example.appmotel.exceptions;

public class EntityNoContent extends RuntimeException{
    private static final Long serialVersionUID = 1L;
    public EntityNoContent(String message){
        super(message);

    }
}
