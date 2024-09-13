#include<iostream>
#include"complex.h"

Complex::Complex():realPart(0),imaginaryPart(0){
}

void Complex::AcceptData(){
	cout<<"Enter the real part : "<<endl;
	cin>>realPart;
	complexNumber[0] = realPart;
	cout<<"Enter the imaginary part : "<<endl;
	cin>>imaginaryPart;
	complexNumber[1] = imaginaryPart;
}

void Complex::DisplayData(){
	cout<<"Complex Number:[real : "<<complexNumber[0]<<" imaginary : "<<complexNumber[1]<<" ] "<<endl;
}
