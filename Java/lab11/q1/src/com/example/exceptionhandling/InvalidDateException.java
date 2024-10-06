package com.example.exceptionhandling;

import java.lang.Exception;

public class InvalidDateException extends Exception{
	public InvalidDateException(){
	}
	public InvalidDateException(String message){
		super(message);
	}
}
