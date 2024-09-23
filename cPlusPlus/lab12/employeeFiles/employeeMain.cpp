#include "permanentEmployee.h"
#include "contractEmployee.h"

int main(){
	
	Employee *employee = NULL;
	PermanentEmployee permanentEmployee("Rushil");
	employee = &permanentEmployee;
	employee->displayData();

	return 0;
}
