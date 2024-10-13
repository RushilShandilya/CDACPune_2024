package com.grocer.ExceptionHandling;

public class NegativeQuantityException extends Exception {
    public NegativeQuantityException(){}
    public NegativeQuantityException(String message){
        super(message);
    }
}
