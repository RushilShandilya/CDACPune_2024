#include<iostream>
using namespace std;

int getFactorial(int number){
	if(number==0) return 1;
	return number*getFactorial(number-1);
}

int main(){
	int n;
	cout<<"Enter Range : "<<endl;
	cin>>n;
	for(int i = 1 ; i<=n ; ++i) cout<<getFactorial(i)<<" ";
	return 0;
}
