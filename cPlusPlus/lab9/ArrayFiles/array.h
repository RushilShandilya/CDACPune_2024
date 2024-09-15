#include<iostream>
using namespace std;

class Array{
	private:
		int size;
		int *arrayAddress;
	public:
		Array(int);
		int* getArrayAddress();
		void AcceptData(int*,int);
		void DisplayData(int*,int);
		~Array();
};
