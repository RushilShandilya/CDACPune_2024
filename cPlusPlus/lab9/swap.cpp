#include<iostream>
using namespace std;

void swap(int &a,int &b){
	int temp = a;
	a = b;
	b = temp;

	return ; 
}

int main(){
	int a,b;
	cout<<"Enter the first value "<<endl;
	cin>>a;
	cout<<"Enter the second value "<<endl;
	cin>>b;
	
	cout<<"The first value is a : "<<a<<" and the second value is b : "<<b<<endl;
	swap(a,b);
	cout<<"The first value is a : "<<a<<" and the second value is b : "<<b<<endl;
	
	return 0;
}
