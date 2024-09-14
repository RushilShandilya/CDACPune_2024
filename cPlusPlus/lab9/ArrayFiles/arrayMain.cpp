#include<iostream>
#include"array.h"
using namespace std;

int main(){
	Array a = Array(3);
	int *pointerToArray;
	for(int i = 0 ; i<3 ; ++i){
		pointerToArray[i].AcceptData();
	}
	return 0;
}
