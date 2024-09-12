#include<iostream>
using namespace std;

string convertIntegerToBinary(int number){
	if(number==0) return "";
	return convertIntegerToBinary(number/2)+to_string(number%2);
}
int main(){
	int number;
	cout<<"Enter desired number : "<<endl;
	cin>>number;
	cout<<convertIntegerToBinary(number);
	return 0;
}
