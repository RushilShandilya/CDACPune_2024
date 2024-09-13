#include<iostream>
#include"student.h"
using namespace std;

int main(){
	Student s[10];
	for(int i = 0 ; i<2 ; ++i){
		string studentName;
		cout<<"Enter the name of student"<<endl;
		getline(cin,studentName);
		s[i] = Student(i+1,studentName);
	}
	for(int i = 0 ; i<2 ; ++i)s[i].displayData();

	return 0;
}
