package com.example.account;

import java.time.LocalDate;

public class Account{
	private int number;
	private String name;
	private LocalDate dateOfOpening;
	private double balance;

	public static int numberGenerator = 0;

	public Account(){}
	public Account(String name,LocalDate dateOfOpening, double balance){
		this.number = ++numberGenerator;
		this.name = name;
		this.dateOfOpening = dateOfOpening;
		this.balance = balance;
	}
	public int getNumber() { return this.number; }
	public String getName() { return this.name; }
	public LocalDate getDateOfOpening() { return this.dateOfOpening; }
	public double getBalance() { return this.balance; }
	//public int getNumberGenerator()
	

	@Override
	public String toString(){
		return "Account:[Number=" + getNumber()
				+" Name=" + getName()
				+" DateOfOpening=" + getDateOfOpening()
				+" Balance=" + getBalance()
				+" ]";
	}
}
