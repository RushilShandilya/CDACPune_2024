#include<iostream>
using namespace std;
	
void printArray(int* pointerToBaseAddress , int sizeOfArray){
	for(int i = 0 ; i<sizeOfArray; ++i) cout<<pointerToBaseAddress[i];
	return ;
}
int main(){
	int sizeOfArray;
	cout<<"Enter size of array : "<<endl;
	cin>>sizeOfArray;
	int exampleArray[sizeOfArray];
	
	for(int i = 0 ; i<sizeOfArray ; ++i)cin>>exampleArray[i];
	printArray(exampleArray,sizeOfArray);

	return 0;
}
