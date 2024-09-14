#include<iostream>
#include"array.h"

Array::Array(int size){
	pointerToBaseAddress = new int[size];
}

void Array::AcceptData(){
	int data;
	cout<<"Enter the desired value you want to enter "<<endl;
	cin>>pointerToBaseAddress->data;
}
void Array::DisplayData(int index){
	cout<<"The value of array is "<<pointerToBaseAddress[index];
}

/*int* Array::pointerToBaseAddress(){
	return pointerToBaseAddress;
}*/

Array::~Array(){
	delete []pointerToBaseAddress;
}

