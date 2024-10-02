package com.bank.deposit;
import com.bank.account.Account;
import java.util.Date;

public class DepositAccount extends Account{
	public DepositAccount(){}
	public DepositAccount(String accountName,Date dateOfCreation,double amount){
		super(accountName,dateOfCreation,amount);
	}
	@Override
	public double applyInterest(){
		double depositAccountamount = getAmount();
		depositAccountamount+=(0.08)*depositAccountamount;
		return depositAccountamount;
	}
	@Override
	public String toString(){
		return "Deposit Account:[Number: " + getAccountNumber()
			+" Name: " + getAccountName()
			+" DateOfOpening: " + getFormattedDate(getDateOfOpening())
			+" Amount: " + getAmount()
			+" Amount after Applying Interest: " + applyInterest()
			+"]";
	}
}
