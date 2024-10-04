package Account;

import java.util.Date;

public class SavingsAccount extends Account{
	private String accountType = "Savings";

	public SavingsAccount(){}
	public SavingsAccount(String holderName,Date dateOfCreation,double balance){
		super(holderName,dateOfCreation,balance);
	}
	@Override
	public void calculateInterest(){
		System.out.println("Coming soon");
	}

	@Override
	public String toString(){
		return "Account:[Type=" +accountType
			+" ID=" + getHolderID()
			+" Name=" + getHolderName()
			+" Date_Of_Creation=" + getDateOfCreation()
			+" Balance=" + getBalance()
			+" ]";
	}
}
