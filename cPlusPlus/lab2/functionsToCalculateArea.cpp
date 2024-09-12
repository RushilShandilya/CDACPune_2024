#include<iostream>
using namespace std;

double areaOfSquare(double side){
	return side*side;
}

double areaOfRectangle(double length, double breadth){
	return length*breadth;
}

double areaOfCircle(double radius){
	return 3.14*radius*radius;
}

int main(){
	char chooseShape;
	switch(chooseShape){
		case 'c':
			int radius;
			cout<<"Enter Radius"<<endl;
			cin>>radius;
			cout<<areaOfCircle(radius);
			break;
		case 's':
			int side;
			cout<<"Enter side"<<endl;
			cin>>side;
			cout<<areaOfSquare(side);
			break;
		case 'r':
			int length,breadth;
			cout<<"Enter Length"<<endl;
			cin>>length;
			cout<<"Enter Breadth"<<endl;
			cin>>breadth;
			break;
		default:
			cout<<"Particular Shape is not in the options";
	}
	return 0;
}
