public class CurrentAccount implements Account{
	private double balance;	
	public static int holderIDGenerator=0;

	public CurrentAccount(){}
	public CurrentAccount(String holderName,Date dateOfCreation,double balance){
		super(++holderIDGenerator,holderName,dateOfCreation);
		this.balance = balance;
	}
	public int getHolderID(){ return Account.holderID; }
	public String getHolderName(){ return Account.holderName; }
	public Date getDateOfCreation(){ return Account.dateOfCreation; }
	public double viewBalance(){ return balance; }
	public void setBalance(double amount){
		this.balance = amount;
	}
	public void withdraw(double amount) throws MinimumBalanceException{
		if(amount>viewBalance()) throw new MinimumBalanceException("Savings Account don't have enough balance");
		double currentBalance = viewBalance()-amount;
		System.out.println("Withdrew money : " + amount);
		setBalance(currentBalance);
		System.out.println("Current balance : "+ viewBalance());
	}
	public void deposit(double amount) throws DepositAmountException{
		if(amount>50000) throw new DepositAmountException("Depositing amount more than allowed for one transaction");
		double currentBalance = viewBalance()+amount;
		System.out.println("Depositing money : " + amount);
		setBalance(currentBalance);
		System.out.println("Current balance : "+ viewBalance());
	}
	public void calculateInterest(){
		System.out.println("Coming Soon");
	}	
}
