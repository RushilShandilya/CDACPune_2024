#include<iostream>
#include"array.h"

Array::Array(int size){
	arrayAddress = new int[size];
}
int* Array::getArrayAddress(){
	return arrayAddress;
}
void Array::AcceptData(int* arrayAddress,int size){
	int data;
	for(int i = 0 ; i<size ; ++i){
		cout<<"Enter the data you want to enter : "<<endl;
		cin>>data;
		arrayAddress[i]=data;
	}
	return ; 
}
void Array::DisplayData(int* arrayAddress,int size){
	for(int i = 0 ; i<size ; ++i)
	       	cout<<"The value of array at index : "<<i<<" is value : "<<arrayAddress[i]<<endl;
}

Array::~Array(){
	delete []arrayAddress;
}

