#include<iostream>
using namespace std;

class ComplexNumber{
	private : 
		int realPart;
		int imaginaryPart;
	public:
		static int countObjectCreated;
		ComplexNumber(){}
		ComplexNumber(int realPart, int imaginaryPart):realPart(realPart),imaginaryPart(imaginaryPart){
			countObjectCreated++;
		}
		void acceptData(){
		}
		void displayData(){
			cout<<"\n Complex Number : [ Real : "<<this->realPart<<" Imaginary : "<<this->imaginaryPart<<" ] "<<endl;
		}
};
int ComplexNumber::countObjectCreated = 0;

int main(){
		
	ComplexNumber complexNumber[10000];
	for(int i = 0 ; i<2; ++i){
		int realPart,imaginaryPart;
		cout<<"Enter the real Part : "<<endl;
		cin>>realPart;
		cout<<"Enter the imaginary Part : "<<endl;
		cin>>imaginaryPart;

		complexNumber[i] = ComplexNumber(realPart,imaginaryPart);
	}

	for(int i = 0 ; i<2 ; ++i)complexNumber[i].displayData();
	
	return 0;
}
