#include<iostream>
using namespace std;

int factorial(const int &number){
	if(number==0) return 1;
	return number * factorial(number-1);
}

int main(){
	cout<<factorial(5);
	return 0;
}
