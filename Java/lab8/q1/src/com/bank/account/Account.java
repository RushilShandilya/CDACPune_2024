package com.bank.account;

import com.bank.depositable.Depositable;
import com.bank.withdrawable.Withdrawable;
import com.bank.maturable.Maturable;
import com.bank.exceptionHandling.MinimumBalanceException;
import java.util.Date;


public class Account implements Depositable,Withdrawable,Maturable{

	private int accountNumber;
	private String accountName;
	private Date dateOfObject;
	private double totalAmount;

	public static int accountNumberGenerator = 0;

	public Account(){}
	public Account(String accountName,Date dateOfObject,double amount){
		this.accountNumber = ++accountNumberGenerator;
		this.accountName = accountName;
		this.dateOfObject = dateOfObject;
		totalAmount = amount;
	}
	public int getAccountNumber(){
		return this.accountNumber;
	}
	public String getAccountName(){
		return this.accountName;
	}
	public Date getDateOfObject(){
		return this.dateOfObject;
	}
	public double getTotalAmount(){
		return this.totalAmount;
	}
	public void setTotalAmount(double amount){
		this.totalAmount = amount;
	}
	public double deposit(double amount){
		double totalAmount = getTotalAmount();
		totalAmount+=amount;
		setTotalAmount(totalAmount);

		return getTotalAmount();
	}
	public double withdraw(double amount) throws MinimumBalanceException{
		if(amount>getTotalAmount()) throw new MinimumBalanceException("Balance is insufficient");
		else{
			double totalAmount = getTotalAmount();
			totalAmount-=amount;
			setTotalAmount(totalAmount);
		}
		return 0;
	}
	public double calculateMaturityAmount(double amount){
		return 0;
	}
}
