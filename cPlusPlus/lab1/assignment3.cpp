#include<iostream>
#include<cmath>
using namespace std;

double calculateCompoundInterest(double principal,double rate,double time , double timesCompounded){	double x = rate/time , y = timesCompounded*time;
	return principal*pow(1+x,y);
}
int main(){
	double principal,rate,time,timesCompounded;
	cout<<"Enter the values listed below : "<<endl;
	cout<<"Principal"<<endl;
       	cin>>principal;
	cout<<"Rate"<<endl;
	cin>>rate;
	cout<<"Time"<<endl;
	cin>>time;
	cout<<"Number of times interest compounded per year"<<endl;
	cin>>timesCompounded;	
	cout<<calculateCompoundInterest(principal,rate,time,timesCompounded);
	return 0;
}
