package src.exceptionhandling;

import java.lang.Exception;

public class DuplicateBookFoundException extends Exception{
	public DuplicateBookFoundException(){}
	public DuplicateBookFoundException(String message){
		super(message);
	}
}