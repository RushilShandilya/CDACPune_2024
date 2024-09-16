#include<iostream>
using namespace std;

class Array{
	private:
		int size;
		int *arrayAddress;
	public:
		//Array(){}
		Array(int size):size(size){
			arrayAddress = new int[size];	
			cout<<"Constructor is called "<<endl;
		}
		Array(const Array& array):size(array.size){
			int* arrayAddress2 = new int[size];
			for(int i = 0 ; i<size ; ++i)
				arrayAddress2[i]=array.getValue(i);
		}
		int getValue(int index) const{
			return arrayAddress[index];
		}

		/*void AcceptData(int size){
			for(int i = 0 ; i<size ; ++i){
				int value;
				cout<<"Enter the value at index : "<<i<<endl;
				cin>>value;
				arrayAddress[i] = value; 
			}
		}*/

		int& operator[](int index){
			return arrayAddress[index];
		}


		void DisplayData(){
			for(int i = 0 ; i<this->size ; ++i)
				cout<<"The value of array at "<<i<<" is "<<this->getValue(i)<<endl;
		}
		~Array(){
			delete []arrayAddress;
		}	
};


int main(){

	Array arr(3);
	arr[0] = 1;
	arr[1] = 2;
	arr[2] = 3;

	arr.DisplayData();

	return 0;
}
