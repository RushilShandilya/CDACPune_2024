#include<iostream>
using namespace std;

double findSimpleInterest(double principal , double rate , double time){
	return (principal * rate * time)/100;
}

int main(){
	double principal,rate,time;
	cout<<"Enter Principal"<<endl;
	cin>>principal;
	cout<<"Enter Rate"<<endl;
	cin>>rate;
	cout<<"Enter Time"<<endl;
	cin>>time;
	cout<<findSimpleInterest(principal,rate,time);
	return 0;
}
