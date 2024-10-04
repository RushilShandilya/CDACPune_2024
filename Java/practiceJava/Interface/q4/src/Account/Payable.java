package Account;

import java.lang.Exception;

public interface Payable{
	public void deposit(double amount) throws Exception;
	public void withdraw(double amount) throws Exception;
	public void calculateInterest();
	public double viewBalance();
}
