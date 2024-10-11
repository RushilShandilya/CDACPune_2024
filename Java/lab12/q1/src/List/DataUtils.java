package src.List;

import java.util.List;
import java.util.LinkedList;
import java.time.LocalDate;
import src.Account.Account;
import src.Account.SavingsAccount;

public class DataUtils{
	private static List<Account> listOfAccount = new LinkedList<>();
	public static List<Account> createData(){
		listOfAccount.add(new Account("Rushil",LocalDate.of(2014,10,8),(double)10000));
		listOfAccount.add(new SavingsAccount("RushilTheSecond",LocalDate.of(2010,10,6),(double)12000));
		listOfAccount.add(new Account("RushilTheThird",LocalDate.of(2012,6,12),(double)14000));
	
		return listOfAccount;
	}
}
