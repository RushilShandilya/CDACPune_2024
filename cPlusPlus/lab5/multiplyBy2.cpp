#include<iostream>
using namespace std;

double multiplyBy2(int number){
	return number*2;
}

int main(){
	char quit;
	do{	
		int value;
		cout<<"Enter value";
		cin>>value;
		cout<<multiplyBy2(value);
		cout<<"Do you want to quit?";
		cin>>quit;
	}while(quit!='Y' && quit!='y');
	return 0;
}

