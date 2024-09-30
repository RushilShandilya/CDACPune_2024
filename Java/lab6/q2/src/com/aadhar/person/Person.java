package com.aadhar.person;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import com.aadhar.address.Address;

public class Person{
	UUID aadharNumber;
	String name;
	Date dateOfBirth;
	Address address;
	
	public Person(){}
	public Person(UUID aadharNumber , String name , Date dateOfBirth , Address address){	
		this.aadharNumber = aadharNumber;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}
	
	public UUID getAadharNumber(){
		return this.aadharNumber;
	}
	public String getName(){
		return this.name;
	}
	public Date getDateOfBirth(){
		return this.dateOfBirth;
	}
	public Address getAddress(){
		return this.address;
	}
	
	String formattedDate(Date date){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return simpleDateFormat.format(date);
	}
	
	@Override
	public String toString(){
		return "Person:[AadharNumber: " + getAadharNumber()
			  +" Name: " + getName()
			  +" Date Of Birth:" + formattedDate(getDateOfBirth())
			  +" Address: " + getAddress()
			  +"]";
		
	}
}