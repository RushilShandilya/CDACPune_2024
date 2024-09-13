#include<iostream>
#include"employee.h"
using namespace std;

Employee::Employee():employeeNumber(0),employeeName(""),employeeSalary(0),employeeDepartment(""){}
Employee::Employee(int employeeNumber , string employeeName , double employeeSalary , string employeeDepartment){
	this->employeeNumber = employeeNumber;
	this->employeeName = employeeName;
	this->employeeSalary = employeeSalary;
	this->employeeDepartment = employeeDepartment;
}

void Employee::AcceptData(){
}
void Employee::DisplayData(){
	cout<<"Enter the Employee Number "<<this->employeeNumber<<endl;
	cout<<"Enter the Employee Name "<<this->employeeName<<endl;
	cout<<"Enter the Employee Salary "<<this->employeeSalary<<endl;
	cout<<"Enter the Employee Department "<<this->employeeDepartment<<endl;
}
