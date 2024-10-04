package Account;

import ExceptionHandling.MinimumBalanceException;
import ExceptionHandling.DepositAmountException;
import java.util.Date;

public abstract class Account implements Payable{
	private int holderID;
	private String holderName;
	private Date dateOfCreation;
	private double balance;
	
	public static int holderIDGenerator = 0;
	
	public Account(){}
	public Account(String holderName,Date dateOfCreation, double balance){
		this.holderID = ++holderIDGenerator; 
		this.holderName = holderName;
		this.dateOfCreation = dateOfCreation;
		this.balance = balance;
	}
	public int getHolderID(){ return this.holderID; }
	public String getHolderName(){ return this.holderName; }
	public Date getDateOfCreation(){ return this.dateOfCreation; }
	public double getBalance(){ return this.balance; }
	
	public void setBalance(double balance){ this.balance = balance; }
	
	@Override
	public void deposit(double amount) throws DepositAmountException{
		if(amount>50000) throw new DepositAmountException("Can't allow a deposit of more than 50K");
		System.out.println("Current balance: " + viewBalance());
		setBalance(viewBalance()+amount);
		System.out.println("Balance after deposit: " + viewBalance());
	}

	@Override
	public void withdraw(double amount) throws MinimumBalanceException{
		if(amount>viewBalance()) throw new MinimumBalanceException("Not sufficient balance to continue the transaction");
		System.out.println("Current balance: " + viewBalance());
		setBalance(viewBalance()-amount);
		System.out.println("Balance after withdraw: " + viewBalance());
	}

	@Override
	public double viewBalance(){
		return this.balance;
	}
	public abstract void calculateInterest();
}
