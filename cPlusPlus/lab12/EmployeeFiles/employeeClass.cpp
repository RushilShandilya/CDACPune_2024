#include"employee.h"

EmployeeClass::EmployeeClass(){}
EmployeeClass::EmployeeClass(std::string employeeName,double employeeSalary):employeeName(employeeName),employeeSalary(employeeSalary){}
void EmployeeClass::calculateSalary(){
	std::cout<<"In Employee Class"<<std::endl;
}
