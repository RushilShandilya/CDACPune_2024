#include"employee.h"

Employee::Employee(){}
Employee::Employee(std::string employeeName):employeeName(employeeName){}
std::string Employee::getEmployeeName() const{
	return this->Employee::employeeName;
}
void Employee::displayData(){
	std::cout<<"Name is : "<<getEmployeeName()<<std::endl;
}
