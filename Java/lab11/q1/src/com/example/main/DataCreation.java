package com.example.main;

import com.example.account.Account;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class DataCreation{
	public static List<Account> createData(){
		//Menu menu = new Menu();
		List<Account> accountList = new ArrayList<>();
		accountList.add(new Account("Arjun",LocalDate.of(2010,10,10),10000.0));
		accountList.add(new Account("Yudhisthir",LocalDate.of(2014,10,8),12300.0));
		accountList.add(new Account("Bheem",LocalDate.of(2020,10,12),14600.0));
		
		return accountList;
	}
}
