#include<iostream>
using namespace std;

double addSum(int a, int b){ return a+b;}
int main(){
	int sum = 0,count=0;
	char quit;
	do{
		int enterNumber;
		cout<<"Enter your number : "<<endl;
		cin>>enterNumber;
		sum=addSum(sum,enterNumber);
		count+=1;
		cout<<"Do you want to quit?"<<endl;
		cin>>quit;
	}
	while(quit!='Y'&& quit!='y');
	cout<<(double)sum/count;
	return 0;
}
