#include<iostream>
using namespace std;

void swapTwoNumbers(int *a, int *b){

	int temp = *a;
	*a=*b;
	*b=temp;

	return ;
}

int main(){
	int a,b;
	cout<<"Enter two Numbers : "<<endl;
	cin>>a;
	cin>>b;
		
	cout<<"Initial check a = "<<a<<" b = "<<b<<endl;
	swapTwoNumbers(&a,&b);
	cout<<"Final check a = "<<a<<" b = "<<b<<endl;

	return 0;
}
