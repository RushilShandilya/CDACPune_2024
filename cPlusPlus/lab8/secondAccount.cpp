#include<iostream>
using namespace std;

class Account{
	private:
		static int accountNumber;
	public:
		void setData(int x){accountNumber=x;}
		int getData(){return accountNumber;}
};
void Account::setData(0)
int main(){
	cout<<obj.getData()<<endl;
	for(int i = 0 ; i<10 ; ++i){
		int value = obj.getData();
		value++;
		obj.setData(value);
	}
	cout<<obj.getData();
	return 0;
}
