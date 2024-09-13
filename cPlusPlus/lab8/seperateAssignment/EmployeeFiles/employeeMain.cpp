#include<iostream>
#include"employee.h"
using namespace std;

int main(){
	Employee employee[10];
	for(int i = 0 ; i<2 ; ++i){
		string employeeName,employeeDepartment;
		double employeeSalary;

		cout<<"Enter Employee Name : "<<endl;
		getline(cin,employeeName);
		
		cout<<"Enter Employee Department : "<<endl;
		getline(cin,employeeDepartment);

		cout<<"Enter Employee Salary : "<<endl;
		cin>>employeeSalary;
		cin.get();
		employee[i] = Employee(i+1,employeeName,employeeSalary,employeeDepartment);
		
		cout<<"Employee added successfully"<<endl;
	}
	return 0;
}
