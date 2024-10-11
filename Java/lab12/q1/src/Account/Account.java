package src.Account;

import java.time.LocalDate;
import java.lang.Comparable;

public class Account implements Comparable<Account>{
	private Integer accountNumber;
	private String accountName;
	private LocalDate dateOfOpening;
	private Double balance;
	
	private static Integer accountNumberGenerator = 0;
	
	public Account(String accountName, LocalDate dob, Double balance) {
		this.accountNumber = ++accountNumberGenerator;
		this.accountName = accountName;
		this.dateOfOpening = dob;
		this.balance = balance;
	}
	
	public Integer getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}

	@Override
	public String toString(){
		return "Account:[Number=" + getAccountNumber()
			+" Name="+ getAccountName()
			+" Date="+ getDateOfOpening()
			+" Balance="+getBalance()
			+" ]";
	}	
	
	@Override
	public int compareTo(Account account){
		int passedNumber = account.getAccountNumber();
		int currentNumber = getAccountNumber();
		
		if(currentNumber>passedNumber) return 1;
		else if(passedNumber==currentNumber) return 0;
		else return -1;
	}
	
}
