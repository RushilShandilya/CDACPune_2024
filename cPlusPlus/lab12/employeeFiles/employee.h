#ifndef EMPLOYEE_H
#define EMPLOYEE_H
#include<iostream>
#include<string>

class Employee{
	protected:
		std::string employeeName;
	public:
		Employee();
		Employee(std::string);
		virtual std::string getEmployeeName() const;
		virtual void displayData();
};

#endif
