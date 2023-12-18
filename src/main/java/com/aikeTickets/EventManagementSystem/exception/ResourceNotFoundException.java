package com.aikeTickets.EventManagementSystem.exception;



public class  ResourceNotFoundException extends RuntimeException{


    public ResourceNotFoundException(String id){

        super("Could not find Event with id "+id);
    }
}
