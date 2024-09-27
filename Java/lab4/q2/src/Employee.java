package com.ghoogle.employee;

public class Employee{
		private int employeeID;
		private String employeeName;
		private double employeeSalary;
		
	public Employee(int employeeID , String employeeName,double employeeSalary){
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeID(){
		return this.employeeID;
	}
	public String getEmployeeName(){
		return this.employeeName;
	}
	public double getEmployeeSalary(){
		return this.employeeSalary;
	}
	public String toString(){
			return ("Employee[Name:" + this.getEmployeeName() 
							+" ID: "+this.getEmployeeID() 
							+" Salary: " +this.getEmployeeSalary()
							+" ]");
	}
	public void sortBySalary(Employee[] arrayOfEmployees,int size){
		for(int i = 0 ; i<size ; ++i){
			for(int j = i+1 ; j<size ; ++j){
				double salaryOfI = arrayOfEmployees[i].getEmployeeSalary();
				double salaryOfJ = arrayOfEmployees[j].getEmployeeSalary();
			
				if(salaryOfI>salaryOfJ){
					Employee temp = arrayOfEmployees[i];
					arrayOfEmployees[i] = arrayOfEmployees[j];
					arrayOfEmployees[j] = temp;
				}
			}
		}
	}
}











       
