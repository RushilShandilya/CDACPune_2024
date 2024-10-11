package src.jobseeker;

import src.jobseeker.Degree;
import src.jobseeker.BasicInformation;
import src.jobseeker.AccountInformation;

import java.time.LocalDate;
import java.util.UUID;

public class JobSeeker{
	private BasicInformation basicInformation;
	private AccountInformation accountInformation;

	public JobSeeker(){}
	public JobSeeker(BasicInformation basicInformation , AccountInformation accountInformation){
		this.basicInformation = basicInformation;
		this.accountInformation = accountInformation;
	}

	public BasicInformation getBasicInformation(){
		return this.basicInformation;
	}

	public AccountInformation getAccountInformation(){
		return this.accountInformation;
	}
}
