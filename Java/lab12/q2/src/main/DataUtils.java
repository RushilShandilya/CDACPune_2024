package src.main;

import src.jobseeker.AccountInformation;
import src.jobseeker.BasicInformation;
import src.jobseeker.JobSeeker;
import src.jobseeker.Degree;

import java.util.UUID;
import java.util.List;
import java.util.LinkedList;
import java.time.LocalDate;


public class DataUtils{
	private static List<JobSeeker> listOfJobSeeker = new LinkedList<>();
	
	public static List<JobSeeker> createDummyData(){	
		BasicInformation bInfo1 = new BasicInformation("A",UUID.randomUUID(),"1234567890",LocalDate.of(1999,1,1),LocalDate.of(1999,1,1),Degree.BTECH);
		AccountInformation aInfo1 = new AccountInformation("email@gmail.com","password");
		JobSeeker jInfo1 = new JobSeeker(bInfo1,aInfo1);
		listOfJobSeeker.add(jInfo1);
		
		BasicInformation bInfo2 = new BasicInformation("B",UUID.randomUUID(),"2345678901",LocalDate.of(2000,1,1),LocalDate.of(2021,1,1),Degree.BBA);
		AccountInformation aInfo2 = new AccountInformation("amail@gmail.com","password");
		JobSeeker jInfo2 = new JobSeeker(bInfo2,aInfo2);
		listOfJobSeeker.add(jInfo2);
		
		BasicInformation bInfo3 = new BasicInformation("C",UUID.randomUUID(),"3456789012",LocalDate.of(2001,1,1),LocalDate.of(2022,1,1),Degree.BCA);
		AccountInformation aInfo3 = new AccountInformation("cmail@gmail.com","password");
		JobSeeker jInfo3 = new JobSeeker(bInfo3,aInfo3);
		listOfJobSeeker.add(jInfo3);
		
		BasicInformation bInfo4 = new BasicInformation("D",UUID.randomUUID(),"4567890123",LocalDate.of(2002,1,1),LocalDate.of(2023,1,1),Degree.BTECH);
		AccountInformation aInfo4 = new AccountInformation("fmail@gmail.com","password");
		JobSeeker jInfo4 = new JobSeeker(bInfo4,aInfo4);
		listOfJobSeeker.add(jInfo4);
		
		BasicInformation bInfo5 = new BasicInformation("E",UUID.randomUUID(),"5678901234",LocalDate.of(1998,1,1),LocalDate.of(2019,1,1),Degree.BCA);
		AccountInformation aInfo5 = new AccountInformation("bmail@gmail.com","password");
		JobSeeker jInfo5 = new JobSeeker(bInfo5,aInfo5);
		listOfJobSeeker.add(jInfo5);
		
		BasicInformation bInfo6 = new BasicInformation("F",UUID.randomUUID(),"6789012345",LocalDate.of(1997,1,1),LocalDate.of(2018,1,1),Degree.BBA);
		AccountInformation aInfo6 = new AccountInformation("tmail@gmail.com","password");
		JobSeeker jInfo6 = new JobSeeker(bInfo6,aInfo6);
		listOfJobSeeker.add(jInfo6);
		
		return listOfJobSeeker;
	}
}