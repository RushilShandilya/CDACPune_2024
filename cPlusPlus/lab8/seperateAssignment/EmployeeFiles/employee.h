#include<iostream>
using namespace std;

class Employee{
	private:	
		int employeeNumber;
		string employeeName;
		double employeeSalary;
		string employeeDepartment;
	public:
		Employee();
		Employee(int,string,double,string);
		void AcceptData();
		void DisplayData();	
};
