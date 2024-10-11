package src.exceptionhandling;

import java.lang.Exception;

public class BookNotFoundException extends Exception{
	public BookNotFoundException(){}
	public BookNotFoundException(String message){
		super(message);
	}
}