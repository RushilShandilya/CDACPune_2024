#include"complex.h"

ComplexNumber::ComplexNumber(){}

ComplexNumber::ComplexNumber(int realPart , int imaginaryPart):realPart(realPart),imaginaryPart(imaginaryPart){}
void ComplexNumber::displayData(){
	std::cout<<"Number : [ Real: "<<this->getRealPart()<<" Imaginary: "<<this->getImaginaryPart()<<" ] "<<std::endl;
}
int ComplexNumber::getRealPart(){
	return this->realPart;
}
int ComplexNumber::getImaginaryPart(){
	return this->imaginaryPart;
}
ComplexNumber ComplexNumber::operator+(ComplexNumber& a){
	ComplexNumber temp;
	temp.realPart = this->getRealPart() + a.getRealPart();
	temp.imaginaryPart = this->getImaginaryPart()+ a.getImaginaryPart();
	return temp;
}
ComplexNumber ComplexNumber::operator-(ComplexNumber& a){
	ComplexNumber temp;
	temp.realPart = this->getRealPart() - a.getRealPart();
	temp.imaginaryPart = this->getImaginaryPart() - a.getRealPart();
	return temp;
}
ComplexNumber ComplexNumber::operator*(ComplexNumber& a){
	ComplexNumber temp;
	temp.realPart=(this->getRealPart()*a.getRealPart())-(this->getImaginaryPart()*a.getImaginaryPart());
	temp.imaginaryPart=(this->getRealPart()*a.getImaginaryPart()) + (this->getImaginaryPart()*a.getRealPart());

	return temp;	
}

