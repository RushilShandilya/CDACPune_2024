#include<iostream>
using namespace std;

class Array{
	private:
		int size;
		int *arrayAddress;
	public:
		Array(){}
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
		void setValue(int index,int value){
			arrayAddress[index] = value;
		}
		int getSize() const{
			return this->size;
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
		Array operator+(Array& array2){
			int newSize = this->getSize() + array2.getSize();
			Array temp(newSize);
			for(int i = 0 ; i<this->getSize() ; ++i)
				temp.arrayAddress[i] = this->getValue(i);
			for(int i = this->getSize() ; i<newSize ; ++i){
				int index = i-(this->getSize());
				temp.arrayAddress[i] = array2[index];
			}
			return temp;
		}


		void DisplayData() const{
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

	Array arr2(3);
	arr2[0] = 4;
	arr2[1] = 5;
	arr2[2] = 6;

	//arr.DisplayData();
	//arr2.DisplayData();
	

	Array arr3(arr+arr2);

	arr3.DisplayData();

	return 0;
}
