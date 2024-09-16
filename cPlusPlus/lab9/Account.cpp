#include<iostream>
using namespace std;

class Account{
	private:
		int accountHolderID;
		string accountHolderName;
		double accountHolderBalance;
	public:
		static int countObject;
		Account(){}
		Account(int accountHolderID,string accountHolderName,double accountHolderBalance):
			accountHolderID(accountHolderID),accountHolderName(accountHolderName),accountHolderBalance(accountHolderBalance){++countObject;}
		void acceptData(){}
		void displayData(){
			cout<<"AccountHolderID : "<<this->accountHolderID<<endl;
			cout<<"Name : "<<this->accountHolderName<<endl;
			cout<<"Balance : "<<this->accountHolderBalance<<endl;
		}
};

void createAccount(Account** listOfPointerForAccounts){
	char toContinue;
	do{
		string getName;
		double balance;

		cout<<"Beginning Account Creation .........."<<endl;
		cout<<"Enter name : "<<endl;
		getline(cin,getName);
		cout<<"Enter Balance : "<<endl;
		cin>>balance;
		cin.get();

		listOfPointerForAccounts[Account::countObject]=new Account(Account::countObject+1,getName,balance);
		cout<<"Account creation successfull"<<endl;
		cout<<"Do you want to continue ? Yes/No (y/n)"<<endl;
		cin>>toContinue;
		cin.get();	
	}while(toContinue!='n' && toContinue!='N');
}

int Account::countObject=0;

int main(){
	Account* listOfPointerForAccounts[10000];
	char toExitTheMenu;
	do{
		createAccount(listOfPointerForAccounts);
		cout<<"Do you want to exit program : Yes/No(y/n)"<<endl;
		cin>>toExitTheMenu;
	}while(toExitTheMenu!='y'&& toExitTheMenu!='Y');
	
	cout<<"Total Object Created :"<<Account::countObject<<endl;
	
	for(int i = 0; i<=Account::countObject ; ++i){
		if(listOfPointerForAccounts[i]==nullptr){
			delete listOfPointerForAccounts[0];
			cout<<"It's null pointer "<<endl;
		}
		else listOfPointerForAccounts[i]->displayData();
		delete listOfPointerForAccounts[i];
	}
	return 0;
}
