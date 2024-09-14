#include<iostream>
using namespace std;

class Student{
	private:
		int studentRollNumber;
		string studentName;	
	public:
		int getStudentRollNumber(){ return studentRollNumber;}
		string getStudentName(){ return studentName;}

		void AcceptData(){
			cout<<"Enter Student Number :"<<endl;
			cin>>studentRollNumber;

			cin.get();
			
			cout<<"Enter Student Name :"<<endl;
			getline(cin,studentName);
		}

		void DisplayData(){
			cout<<"Student Roll Number : "<<studentRollNumber<<endl;
			cout<<"Student Name : "<<studentName<<endl;	
		}
};

void sortStudentByRollNumber(Student* studentArray,int numberOfStudents){
	for(int i = 0 ; i<numberOfStudents ; ++i){
		for(int j = i+1 ; j<numberOfStudents ; ++j){
			if(studentArray[i].getStudentRollNumber()>studentArray[j].getStudentRollNumber()){
				Student temp = studentArray[i];
				studentArray[i] = studentArray[j];
				studentArray[j] = temp;
			}
		}
	}
}

int main(){
	int numberOfStudents;
	
	cout<<"Number of Students"<<endl;
	cin>>numberOfStudents;

	Student student[numberOfStudents];

	for(int i = 0 ; i<numberOfStudents; ++i)student[i].AcceptData();
	for(int i = 0 ; i<numberOfStudents; ++i)student[i].DisplayData();
	
	sortStudentByRollNumber(student,numberOfStudents);

	for(int i = 0 ; i<numberOfStudents; ++i)student[i].DisplayData();

	return 0;
}
