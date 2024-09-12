#include<iostream>
using namespace std;

int findSum(int number){
	int sum = 0;
	for(;number!=0;){
		sum+=number%10;
		number=number/10;
	}
	return sum;
}
int main(){
	int number;
	cout<<"Enter Number : "<<endl;
	cin>>number;
	cout<<findSum(number);
	return 0;
}

	
