package com.aadhar.address;

public class Address{
	private String flatNumber;
	private String area;
	private String landmark;
	private String pincode;
	
	public Address(){}
	public Address(String flatNumber, String area , String landmark , String pincode){
		this.flatNumber = flatNumber;
		this.area = area;
		this.landmark = landmark;
		this.pincode = pincode;
	}
	
	public String getFlatNumber(){
		return this.flatNumber;
	}
	public String getArea(){
		return this.area;
	}
	public String getLandmark(){
		return this.landmark;
	}
	public String getPincode(){
		return this.pincode;
	}
	
	@Override
	public String toString(){
		return "Address:[FlatNumber: "+getFlatNumber()
			  +" Area: "+getArea()
			  +" Landmark: "+getLandmark()
			  +" Pincode: "+getPincode()
			  +" ]";
	}
}