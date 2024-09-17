#include"complex.h"

int main(){
	ComplexNumber c1(5,3);
	ComplexNumber c2(3,4);
	ComplexNumber c3;
	ComplexNumber c4;
	ComplexNumber c5;
	c3 = c1+c2;
	c4 = c1-c2;
	c5 = c1*c2;

	c3.displayData();
	c4.displayData();
	c5.displayData();

	return 0;
}
