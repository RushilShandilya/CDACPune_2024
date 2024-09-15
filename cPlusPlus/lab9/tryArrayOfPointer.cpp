#include<iostream>
using namespace std;

void TryPointer(Account** accountList){
	for(int i = 0 ; i<5 ; ++i) cout<< accountList[i]<<endl;
	return ;
}

int main(){
	Account* accountList[5];
	TryPointer(accountList);
	return 0;
}
