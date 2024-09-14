#include<iostream>
using namespace std;

class Array{
	private:
		int size;
		int *pointerToBaseAddress;
	public:
		Array(int);
		//int* getPointer();
		void AcceptData();
		void DisplayData(int);
		~Array();
};
