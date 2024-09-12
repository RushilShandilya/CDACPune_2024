#include<iostream>
using namespace std;

class Student{
	private:
		int studentRollNumber;
		string studentName;
	public:
		Student():studentRollNumber(0),studentName(""){
			cout<<"In the default constructor"<<endl;
		}
		Student(int studentRollNumber,string studentName){
			this->studentRollNumber = studentRollNumber;
			this->studentName = studentName;
		}
		void acceptData(int studentRollNumber, string studentName){
			this->studentRollNumber = studentRollNumber;
			this->studentName = studentName;
		}
		void displayData(){
			cout<<"The value of rollnumber is : "<<studentRollNumber<<endl;			   	        cout<<"The value of name is : "<<studentName<<endl;
		}
};

int main(){
	//Student* student1 = new Student(1,"Rushil");
	//student1->displayData();
	
	int numberOfStudents;
	cout<<"Enter the number of students : "<<endl;
	cin>>numberOfStudents;
	cin.get();

	Student* listOfStudent = new Student[numberOfStudents];
	for(int i = 0 ; i<numberOfStudents ; ++i){
		string getStudentName;
		cout<<"Enter Student Name : "<<endl;
		//cin.get();
		getline(cin,getStudentName);	
		listOfStudent[i] = Student(i,getStudentName);
	}

	for(int i=0 ; i<numberOfStudents ; ++i){
		listOfStudent[i].displayData();
	}

	return 0;
}
