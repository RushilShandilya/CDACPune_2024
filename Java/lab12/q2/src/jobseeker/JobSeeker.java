package src.jobseeker;

import src.jobseeker.Degree;
import src.jobseeker.BasicInformation;
import src.jobseeker.AccountInformation;

import java.time.LocalDate;
import java.util.UUID;
import java.lang.Comparable;

public class JobSeeker implements Comparable<JobSeeker>{
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
	
	@Override
	public String toString(){
		return "[Jobseeker:Name=" + basicInformation.getName()
				+" AadharID=" + basicInformation.getAadharID()
				+" PhoneNumber=" + basicInformation.getPhoneNumber()
				+" DateOfBirth=" + basicInformation.getDateOfBirth()
				+" DateOfGraduation=" + basicInformation.getGraduationDate()
				+" Degree=" + basicInformation.getGraduationDegree().getFullForm()
				+" Registration ID=" + accountInformation.getRegistrationID()
				+" Email=" + accountInformation.getEmail()
				+" Password=" + accountInformation.getPassword()
				+" ]";
	}
	@Override
	public int compareTo(JobSeeker jobseeker){
		return (accountInformation.getEmail()).compareTo(jobseeker.getAccountInformation().getEmail());
	}
}
