#include<iostream>
#include<cmath>
using namespace std;

bool checkIfEvenOrOdd(int n){
	return n%2==0;
}
int main(){
	int n;
	cout<<"Enter number"<<endl;
	cin>>n;
	cout<<checkIfEvenOrOdd(n);
	
	return 0;
}
