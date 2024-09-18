#include"contractEmployee.h"
#include"permanentEmployee.h"

int main(){
	EmployeeClass *employeePointer=NULL;
	PermanentEmployee permanentEmployee;
	employeePointer = &permanentEmployee;
	employeePointer->calculateSalary();


	ContractEmployee contractEmployee;
	return 0;
}
