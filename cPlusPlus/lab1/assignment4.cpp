#include<iostream>
using namespace std;

int calcPower(int base , int power){
	int result = 1;
	while(power!=0){
	result*=base; 	
	power--;
	}
	return result;
}
int main(){
	int base,power;
	cout<<"Enter base and power below"<<endl;
	cin>>base;
	cin>>power;
	cout<<calcPower(base,power);
	
	return 0;
}
	
