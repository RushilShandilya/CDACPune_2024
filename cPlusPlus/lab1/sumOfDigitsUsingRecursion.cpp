#include<iostream>
using namespace std;

int sumOfDigits(int number){
	if(number==0)return 0;
	return number%10 + sumOfDigits(number/10);
}

int main(){
	int number;
	cout<<"Enter number = "<<endl;
	cin>>number;
	cout<<sumOfDigits(number);	
	return 0;
}
