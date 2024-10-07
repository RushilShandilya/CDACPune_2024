package com.school.ExceptionHandling;

import java.lang.Exception;

public class WrongDivisionException extends Exception{
	public WrongDivisionException(){}
	public WrongDivisionException(String message){
		super(message);
	}
}