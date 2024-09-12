#include<iostream>
using namespace std;

bool checkIfCapitalOrNot(char a){
	if(a>=97 && a<=122) return false;
	else if(a>=65 && a<=90) return true;
}

int main(){
	char desiredCharacter;
	cout<<"Enter your desired character capital or not : "<<endl;
	cin>>desiredCharacter;
	if(checkIfCapitalOrNot(desiredCharacter)) cout<<"Is Capital";
	else cout<<"Is not capital";

	return 0;
}
