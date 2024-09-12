#include<iostream>
using namespace std;

void printArray(int* pointerToBaseAddress,int lengthOfArray){
	for(int i = 0 ; i<lengthOfArray ; ++i)cout<<pointerToBaseAddress[i]<<" ";
	cout<<"\n";
	return;
}
void sortArray(int* pointerToBaseAddress,int lengthOfArray){
	for(int i = 0 ; i<lengthOfArray ; ++i){
		for(int j = i+1 ; j<lengthOfArray ; ++j){
			int temp = pointerToBaseAddress[i];
			pointerToBaseAddress[i] = pointerToBaseAddress[j];
			pointerToBaseAddress[j] = temp;
		}
	}
	return;
}

int main(){
	int sizeOfArray;
	cout<<"Enter Size of Array :"<<endl;
	cin>>sizeOfArray;
	int desiredArray[sizeOfArray];

	for(int i = 0 ; i<sizeOfArray ; ++i){
		cout<<"Enter number into the array"<<endl;
		cin>>desiredArray[i];
	}
	printArray(desiredArray,sizeOfArray);
	sortArray(desiredArray,sizeOfArray);
	printArray(desiredArray,sizeOfArray);
	return 0;
}
