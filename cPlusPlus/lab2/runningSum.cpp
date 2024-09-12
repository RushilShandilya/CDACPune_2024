#include<iostream>
#include<cmath>
using namespace std;

void runningSpace(int* arr,int length){
	int previous = 0;
	for(int i = 0 ; i<length ; ++i){
		previous+=arr[i];
		arr[i]=previous;
	}
	return;
}
int main(){
	int arr[] = {1,2,3,4,5};
	int length = sizeof(arr)/sizeof(int);
	runningSpace(&arr[0],length);
	for(int i = 0 ; i<length ; ++i) cout<<arr[i]<<" ";
	return 0;
}
