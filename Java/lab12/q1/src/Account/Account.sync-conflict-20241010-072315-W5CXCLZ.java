import java.time.LocalDate;

public class Account {
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
	
	public Double setBalance(double balance){
		this.balance = balance;
	}
	
	@Overide
	public int compareTo(int accountNumber){
		if(this.accountNumber<accountNumber) return 1;
		else if(this.accountNumber == accountNumber) return 0;
		else return -1;
	}
	
}
