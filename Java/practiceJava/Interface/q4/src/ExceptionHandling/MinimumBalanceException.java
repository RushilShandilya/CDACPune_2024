package ExceptionHandling;
import java.lang.Exception;

public class MinimumBalanceException extends Exception{
	public MinimumBalanceException(){}
	public MinimumBalanceException(String message){
		super(message);
	}
}
