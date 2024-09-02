#include<iostream>
using namespace std;

int addTwoNumber(int a , int b){
	return a+b;
}

int main(){
	cout<<"Welcome\n";
	cout<<"Choose the function you want to use\n";
	cout<<"Press 1 for addition of 2 numbers \n";
	cout<<"Press 2 for addition of 2 binary numbers \n";
	cout<<"Press 3 for addition of 2 characters \n";
	
	int a;
	cin>>a;
	switch(a){
		case 1:
			int number1=0,number2=0;
			cout<<"Enter First Number\n";
			cin>>number1;
			cout<<"Enter Second Number\n";
			cin>>number2;
			cout<<addTwoNumber(number1,number2);
			break;
		case 2:
			cout<<"Coming Soon";
			break;
		case 3:
			cout<<"Coming Soon";
			break;
		default:
			cout<<"Wrong choice";
			
	}
	return 0;
}
