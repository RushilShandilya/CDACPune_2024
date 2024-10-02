package com.bank.account;

import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class Account{
	private int accountNumber;
	private String accountName;
	private Date dateOfOpening;
	private double amount;
	
	public static int accountNumberGenerator = 0;
	
	public Account(){}
	public Account(String accountName,Date dateOfOpening, double amount){
		this.accountNumber =  ++accountNumberGenerator;
		this.accountName = accountName;
		this.dateOfOpening = dateOfOpening;
		this.amount = amount;
	}
	public Account(Account account){
		this.accountName = account.accountName;
		this.dateOfOpening = account.dateOfOpening;
		this.amount = account.amount;
	}
	public int getAccountNumber(){
		return this.accountNumber;
	}
	public String getAccountName(){
		return this.accountName;
	}
	public Date getDateOfOpening(){
		return this.dateOfOpening;
	}
	public double getAmount(){
		return this.amount;
	}
	public String getFormattedDate(Date date){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return simpleDateFormat.format(date);
	}
	
	public abstract double applyInterest();	
}
