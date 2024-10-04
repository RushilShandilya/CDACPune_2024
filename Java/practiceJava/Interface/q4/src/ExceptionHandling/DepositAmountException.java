package ExceptionHandling;
import java.lang.Exception;

public class DepositAmountException extends Exception{
	public DepositAmountException(String message){
		super(message);
	}
}
