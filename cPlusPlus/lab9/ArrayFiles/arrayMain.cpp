#include<iostream>
#include"array.h"
using namespace std;

int main(){
	Array a = Array(3);
	
	a.AcceptData(a.getArrayAddress(),3);
	a.DisplayData(a.getArrayAddress(),3);

	return 0;
}
