#include<iostream>
using namespace std;

int main(){
	string str = "";
	char quit;
	do{
		char ch;
		cout<<"Enter character : "<<endl;
		cin>>ch;
		str+=ch;
		cout<<"Do you want to quit : "<<endl;
		cin.get();
		cin>>quit;
	}while(quit!='Y'&& quit!='y');

	cout<<str;
	return 0;
}
