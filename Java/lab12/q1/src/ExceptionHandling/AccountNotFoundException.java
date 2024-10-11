package src.ExceptionHandling;

import java.lang.Exception;

public class AccountNotFoundException extends Exception{
	public AccountNotFoundException(){}
	public AccountNotFoundException(String message){
		super(message);
	}
}
