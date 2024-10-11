import java.lang.Exception;

public class AccountNotFoundException extend Exception{
	public AccountNotFoundException(){}
	public AccountNotFoundException(String message){
		super(message);
	}
}