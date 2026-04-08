package com.lcwd.hotel.exception;

public class ResourceException extends RuntimeException{
    public ResourceException(String s){
        super(s);
    }

    public ResourceException(){
        super("Resource not found!!");
    }
}
