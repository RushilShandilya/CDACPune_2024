#include<iostream>
using namespace std;

string reverseString(string name , int length){
	if(length<0) return "";
	return name.at(length-1) + reverseString(name,length-1);
}

int main(){
	string name;
	cout<<"Enter the string : ";
	cin>>name;
	cout<<reverseString(name,name.length());

	return 0;
}
