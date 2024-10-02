package com.bank.current;
import com.bank.account.Account;
import java.util.Date;

public class CurrentAccount extends Account{
	public CurrentAccount(){}
	public CurrentAccount(String accountName,Date dateOfCreation,double amount){
		super(accountName,dateOfCreation,amount);
	}
	@Override
	public double applyInterest(){
		double currentAccountAmount = getAmount();
		currentAccountAmount+=(0.01)*currentAccountAmount;
		return currentAccountAmount;
	}
	@Override
	public String toString(){
		return "Current Account:[Number: " + getAccountNumber()
			+" Name: " + getAccountName()
			+" DateOfOpening: " + getFormattedDate(getDateOfOpening())
			+" Amount: " + getAmount()
			+" Amount after Applying Interest: " + applyInterest()
			+"]";
	}
}
