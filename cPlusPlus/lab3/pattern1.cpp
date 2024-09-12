#include<iostream>
using namespace std;

void printPattern(int sizeOfPattern){
	//i --> VerticalRow , j --> HorizontalRow;
	for(int i = 0 ; i<sizeOfPattern ; ++i){
		for(int j = i ; j<sizeOfPattern ; ++j) cout<<"*";
		cout<<"\n";
	}
	return ;
}

int main(){
	int n;
	cout<<"Enter size of the Pattern : ";
	cin>>n;
	printPattern(n);

	return 0;
}
