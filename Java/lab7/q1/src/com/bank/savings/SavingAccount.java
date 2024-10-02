package com.bank.savings;
import com.bank.account.Account;
import java.util.Date;

public class SavingAccount extends Account{
	public SavingAccount(){}
	public SavingAccount(String accountName,Date dateOfCreation,double amount){
		super(accountName,dateOfCreation,amount);
	}
	@Override
	public double applyInterest(){
		double savingAccountAmount = getAmount();
		savingAccountAmount+=0.03*savingAccountAmount;
		
		return savingAccountAmount;
	}
	@Override
	public String toString(){
		return "Savings Account:[Number: " + getAccountNumber()
			+" Name: " + getAccountName()
			+" DateOfOpening: " + getFormattedDate(getDateOfOpening())
			+" Amount: " + getAmount()
			+" Amount after Applying Interest: " + applyInterest()
			+"]";
	}
}
