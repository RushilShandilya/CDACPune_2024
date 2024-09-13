#include<iostream>
#include"student.h"
using namespace std;

Student::Student(){}

Student::Student(int studentRollNumber,string studentName){
	this->studentRollNumber = studentRollNumber;
	this->studentName = studentName;
}
void Student::acceptData(int studentRollNumber,string studentName){
	this->studentRollNumber = studentRollNumber;
	this->studentName = studentName;	
}
void Student::displayData(){
	cout<<"This student roll number is : "<<this->studentRollNumber<<endl;
	cout<<"This student name is : "<<this->studentName<<endl;
}
