#include<iostream>
using namespace std;

void swapFunction(int *a , int *b){
	int temp = *a;
	*a = *b;
	*b = temp;
}
int main(){
	int a,b;
	cout<<"Enter First Number : "<<endl;
	cin>>a;
	cout<<"Enter Second Number : "<<endl;
	cin>>b;

	swapFunction(&a,&b);	

	cout<<"First Number : "<<a<<" and Second Number is : "<<b;

	return 0;
}
