#include<iostream>
using namespace std;

class Employee{
	private:
		int employeeNumber;
		string employeeName;
		double employeeSalary;
		string employeeDepartment;
	public:
		void AcceptData(/*Employee employee*/){
			cout<<"Enter Employee Number :"<<endl;
			cin>>employeeNumber;
			//employee.employeeNumber = employeeNumber;

			cin.get();
			
			cout<<"Enter Employee Name :"<<endl;
			getline(cin,employeeName);
			//employee.employeeName = employeeName;

			cout<<"Enter Employee Salary :"<<endl;
			cin>>employeeSalary;
			//employee.employeeSalary = employeeSalary;

			cin.get();

			cout<<"Enter Employee Department :"<<endl;
			getline(cin,employeeDepartment);
			//employee.employeeDepartment = employeeDepartment;
		}

		void DisplayData(){
			cout<<"Employee Number : "<<employeeNumber<<endl;
			cout<<"Employee Name : "<<employeeName<<endl;
			cout<<"Employee Salary : "<<employeeSalary<<endl;
			cout<<"Employee Department : "<<employeeDepartment<<endl;	
		}
};

int main(){
	int numberOfEmployees;
	
	cout<<"Number of Employees"<<endl;
	cin>>numberOfEmployees;

	Employee employee[numberOfEmployees];

	for(int i = 0 ; i<numberOfEmployees; ++i)employee[i].AcceptData();
	for(int i = 0 ; i<numberOfEmployees; ++i)employee[i].DisplayData();
	
	return 0;
}
