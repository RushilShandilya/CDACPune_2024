package com.bank.exceptionHandling;
import java.lang.Exception;

public class ListFullException extends Exception{
	public ListFullException(){}
	public ListFullException(String message){
		super(message);
	}
}
