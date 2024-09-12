#include<iostream>
using namespace std;

double areaOfRectangle(double length  , double breadth){
	return length*breadth;
}

int main(){
	double length,breadth;
	cout<<"Enter length : "<<endl;
	cin>>length;
	cout<<"Enter breadth : "<<endl;
	cin>>breadth;

	cout<<areaOfRectangle(length,breadth);
	return 0;
}
