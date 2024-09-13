#include<iostream>
using namespace std;

class Complex{
	private:
		int realPart;
		int imaginaryPart;
		int complexNumber[2];
	public:
		Complex();
		void AcceptData();
		void DisplayData();	
};
