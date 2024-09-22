#include<iostream>
#include<string>

class Employee{
	protected:
		std::string employeeName;
		const int baseSalary = 10000;
	public:
		Employee(){}
		Employee(std::string employeeName):employeeName(employeeName){}
		virtual int calculateSalary()=0;
		std::string getEmployeeName() const{
			return this->employeeName;
		}

		int getBaseSalary() const{
			return this->baseSalary;
		}

		virtual void displayData() {
			std::cout<<"Name is : "<<getEmployeeName()<<std::endl;
			std::cout<<"Base Salary is : "<<getBaseSalary()<<std::endl;
			std::cout<<"Total Salary is : "<<calculateSalary()<<std::endl;
		}
};
class PermanentEmployee : public Employee{
	public:
		PermanentEmployee(){}
		PermanentEmployee(std::string employeeName):Employee(employeeName){}
		int calculateSalary() {
			return 20*(Employee::getBaseSalary());
		}
};


class ContractEmployee : public Employee{
	public:
		ContractEmployee(){}
		ContractEmployee(std::string employeeName):Employee(employeeName){}
		int calculateSalary() {
			return 10*(Employee::getBaseSalary());
		}
};

int main(){
	Employee *employee;
	PermanentEmployee permanentEmployee("Rushil");
	employee = &permanentEmployee;
	employee->displayData();

	ContractEmployee contractEmployee("Riti");
	employee = &contractEmployee;
	employee->displayData();
	return 0;
}
