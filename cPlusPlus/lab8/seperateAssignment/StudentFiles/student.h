#include<iostream>
using namespace std;

class Student{
	private:
		int studentRollNumber;
		string studentName;
	public:
		Student();
		Student(int studentRollNumber,string studentName);
		void acceptData(int studentRollNumber, string studentName);
		void displayData();
};
