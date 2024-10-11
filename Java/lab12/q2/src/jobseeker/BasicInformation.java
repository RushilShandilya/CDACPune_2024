package src.jobseeker;

import java.util.UUID;
import java.time.LocalDate;

public class BasicInformation{
	private String name;
	private UUID aadharID;
	private String phoneNumber;
	private LocalDate dateOfBirth;
	private LocalDate graduationDate;
	private Degree graduationDegree;

	public BasicInformation(String name, UUID aadharID, String phoneNumber, LocalDate dateOfBirth, LocalDate gradDate, Degree degree){
		this.name = name;
		this.aadharID = aadharID;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		graduationDate = gradDate;
		graduationDegree = degree;
	}
	public String getName(){
		return name;
	}
	public UUID getAadharID(){
		return aadharID;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public LocalDate getDateOfBirth(){
		return dateOfBirth;
	}
	public LocalDate getGraduationDate(){
		return graduationDate;
	}
	public Degree getGraduationDegree(){
		return graduationDegree;
	}
}
