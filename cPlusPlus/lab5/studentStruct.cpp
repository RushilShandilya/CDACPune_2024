#include<iostream>
using namespace std;

struct Student{
	string studentName;
	int rollNumber;
};

void InputData(Student* pointerToTheBaseAddressOfStudentArray,int sizeOfStudentArray){
	for(int i = 0 ; i<sizeOfStudentArray; ++i){
		cout<<"Enter Student Name:"<<endl;
		cin>>pointerToTheBaseAddressOfStudentArray[i].studentName;
		cout<<"Enter Student RollNumber"<<endl;
		cin>>pointerToTheBaseAddressOfStudentArray[i].rollNumber;	
	}
	return;
}

void PrintData(Student* pointerToTheBaseAddressOfStudentArray,int sizeOfStudentArray){
	for(int i = 0 ; i<sizeOfStudentArray ; ++i){
		cout<<"Student Name is : " <<pointerToTheBaseAddressOfStudentArray[i].studentName<<endl;
		cout<<"Student Roll Number is : "<<pointerToTheBaseAddressOfStudentArray[i].rollNumber<<endl;
	}
	return ;
}
int main(){
	int numberOfStudents;
	cout<<"Enter Number of Students : "<<endl;
	cin>>numberOfStudents;

	Student studentDetails[numberOfStudents];
	
	//studentDetails in the InputData(studentDetails,numberOfStudents); is basically baseAddress to the Student Memory created in stack

	InputData(studentDetails,numberOfStudents);
	PrintData(studentDetails,numberOfStudents);

	return 0;
}
