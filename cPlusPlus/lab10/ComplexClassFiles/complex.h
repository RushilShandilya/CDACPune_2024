#include<iostream>

class ComplexNumber{
	private:
		int realPart;
		int imaginaryPart;
	public:
		ComplexNumber();
		ComplexNumber(int,int);
		int getRealPart();
		int getImaginaryPart();
		void displayData();
		ComplexNumber operator+(ComplexNumber&);
		ComplexNumber operator-(ComplexNumber&);
		ComplexNumber operator*(ComplexNumber&);
};
