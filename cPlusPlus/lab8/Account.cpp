#include<iostream>
using namespace std;

class Account{
	private:
		int accountID;
		string accountHolderName;
		double balance;
	public:
		static int accountNumber;
		Account():accountHolderName(""),balance(0.0){}
		Account(string accountHolderName , double balance){
			this->accountHolderName = accountHolderName;
			this->balance = balance;
			accountID=accountNumber+1;
			++accountNumber;
			cout<<"The count of object created is : "<<accountNumber<<endl;
		}
		int getAccountID(){return this->accountID;}
		void setBalance(int balance){
			this->balance = balance;
		}
		int getBalance(){
			return this->balance;
		}
		void AcceptData(){
		}
		void DisplayData(){
			cout<<"The address of the invoked object : "<<this<<endl;
			cout<<"Account holder name : "<<this->accountHolderName<<endl;
			cout<<"Account Balance : "<<this->balance<<endl;
		}
		void WithdrawAmount(double amountToWithdraw,Account* desiredAccount){
			int amountRemaining = desiredAccount->getBalance() - amountToWithdraw;
			if(amountRemaining>0){
				cout<<"New balance after withdrawl : "<<amountRemaining<<endl;
				desiredAccount->setBalance(amountRemaining);
				cout<<"Goodbye"<<endl;
			}
			else cout<<"Not sufficient Balance"<<endl;
				
		}
		void DepositAmount(double amountToDeposit,Account* desiredAccount){
			
			int newAmount = desiredAccount->getBalance()+amountToDeposit;
		       	desiredAccount->setBalance(newAmount);
			cout<<"New balance after deposit : "<<desiredAccount->balance<<endl;
			return;	
		}
};

void createNewAccount(Account* accountList){	
	char ch;
	do{
		string getName;
		double balance;

		cout<<"Enter the account holder name : "<<endl;
		getline(cin,getName);
		cout<<"Enter Initial Money (0 by default): "<<endl;
		cin>>balance;
		cin.get();
		accountList[Account::accountNumber] = Account(getName,balance);
		cout<<"Do you want to add more accounts ? Type y/n "<<endl;
		cin>>ch;
		cin.get();
	}while(ch!='n'&&ch!='N');

	return ;
}
Account* findAccount(int accountNumber,int numberOfValidAccounts,Account *listOfAccount){
      	Account temp = Account("No Account was found",0);
	for(int i = 0 ; i<=numberOfValidAccounts ; ++i){
		if(listOfAccount[i].getAccountID()==accountNumber)
			return &listOfAccount[i];
	}
	return &temp;
}
int Account::accountNumber=0;
int main(){
	
	Account accountList[10000];
	cout<<"Welcome to Rushil Bank Pvt. Limited"<<endl;
	char toExitTheMenu;
	do{
		int enterMenuOption;
		int accountID;
		Account *account;
		cout<<"Please choose b/w the given options(Press 1,2,3) : "<<endl;
		cout<<"1. Create a new bank account "<<endl;
		cout<<"2. Display data of a bank account "<<endl;
		cout<<"3. Withdraw money to account "<<endl;
		cout<<"4. Deposit money from account "<<endl;
		cin>>enterMenuOption;	
		cin.get();	
		switch(enterMenuOption){
			case 1:
				createNewAccount(accountList);
				cout<<"New Account(s) created successfully"<<endl;
				break;
			case 2:
				cout<<"Enter account number"<<endl;
				cin>>accountID;
				account = findAccount(accountID,Account::accountNumber,accountList);
				account->DisplayData();
				break;
			case 3:
				int withdrawAmount;
				cout<<"Enter Account ID : "<<endl;
				cin>>accountID;
				account = findAccount(accountID,Account::accountNumber,accountList);
				if(account->getAccountID()>0){
					cout<<"Enter the money to withdraw : "<<endl;
					cin>>withdrawAmount;
					account->WithdrawAmount(withdrawAmount,account);
				}else cout<<"Account doesn't exist"<<endl;

				break;

			case 4:
				int depositAmount;
				cout<<"Enter Account Number : "<<endl;
				cin>>accountID;
				account = findAccount(accountID,Account::accountNumber,accountList);
				if(account->getAccountID()>0){
					cout<<"Enter the money to deposit : "<<endl;
					cin>>depositAmount;
					account->DepositAmount(depositAmount,account);
				}else cout<<"Account doesn't exist"<<endl;
				break;
			defeault:
				cout<<"Waiting for correct operation"<<endl;
		}
		cout<<"Do you want to go back to menu? Y/N : "<<endl;
		cin>>toExitTheMenu;
	}while(toExitTheMenu!='n' && toExitTheMenu!='N');

	return 0;
}
