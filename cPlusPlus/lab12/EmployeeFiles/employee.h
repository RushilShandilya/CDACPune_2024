#ifndef employee_h
#define employee_h
#include<iostream>
#include<string>

class EmployeeClass{
	private:
		std::string employeeName;
		double employeeSalary;
	public:
		EmployeeClass();
		EmployeeClass(std::string,double);
		virtual	void calculateSalary();
};
#endif
