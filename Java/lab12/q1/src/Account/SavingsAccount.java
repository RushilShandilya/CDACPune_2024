package src.Account;

import src.Account.Account;
import java.time.LocalDate;

public class SavingsAccount extends Account{
	public SavingsAccount(String name,LocalDate date,double balance){
		super(name,date,1.2*balance);
	}
}

