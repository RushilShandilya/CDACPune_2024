#include<iostream>
using namespace std;

int main(){
	int n;
	cout<<"Enter the size of Row "<<endl;
	cin>>n;

	for(int i = 0 ; i<n ; ++i){
		for(int j=i; j<n ; ++j)cout<<"*";
		for(int j=0; j<i ; ++j)cout<<" ";
		for(int j=0; j<i ; ++j)cout<<" ";
		for(int j=i; j<n ; ++j)cout<<"*";
		
		cout<<"\n";
	}
	for(int i = 0; i<n ; ++i){
		if(i!=0){
			for(int j=0; j<i+1 ; ++j)cout<<"*";
			for(int j=i; j<n-1 ; ++j)cout<<" ";
			for(int j=i; j<n-1 ; ++j)cout<<" ";
			for(int j=0; j<i+1 ; ++j)cout<<"*";
			cout<<"\n";
		}
	}
	return 0;
}
