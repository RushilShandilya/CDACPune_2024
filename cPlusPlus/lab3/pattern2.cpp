#include<iostream>
using namespace std;

void printPattern(int sizeOfPattern){
	//i-->Horizontal Rows , j-->Vertical Rows
	for(int i=0 ; i<sizeOfPattern ; ++i){
		for(int j=0 ; j<i; ++j) cout<<" ";
		for(int j=i; j<sizeOfPattern ; ++j) cout<<"*";
		cout<<"\n";
	}
	return;
}

int main(){
	int sizeOfArray;
	cout<<"Enter the size of pattern : ";
	cin>>sizeOfArray;
	printPattern(sizeOfArray);

	return 0;
}
