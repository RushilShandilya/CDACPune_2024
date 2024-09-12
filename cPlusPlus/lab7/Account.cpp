#include<iostream>
using namespace std;

class Account{
	private:
		int accountNumber;
		string accountHolderName;
		double balance;
	public:
		Account():accountNumber(0),accountHolderName(""),balance(0.0){}
		Account(int accountNumber, string accountHolderName , double balance){
			this->accountNumber = accountNumber;
			this->accountHolderName = accountHolderName;
			this->balance = balance;
		}
		int getAccountNumber(){
			return this->accountNumber;
		}
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
		void WithdrawAmount(int accountNumber,double amountToWithdraw,Account desiredAccount){
			int amountRemaining = desiredAccount.getBalance() - amountToWithdraw;
			if(amountRemaining>0){
				cout<<"New balance after withdrawl : "<<amountRemaining<<endl;
				desiredAccount.setBalance(amountRemaining);
				cout<<"Goodbye"<<endl;
			}
			else cout<<"Not sufficient Balance"<<endl;
				
		}
		void DepositAmount(int accountNumber,double amountToDeposit,Account desiredAccount){
			
			int newAmount = desiredAccount.getBalance()+amountToDeposit;
		       	desiredAccount.setBalance(newAmount);
			cout<<"New balance after deposit : "<<desiredAccount.balance<<endl;
			return;	
		}
};

int enterNewAccountOperation(Account* accountList,int initialCount){	
	char ch;
	int count = initialCount;
	do{
		string getName;
		double balance;

		cout<<"Enter the account holder name : "<<endl;
		getline(cin,getName);
		cout<<"Enter Initial Money (0 by default): "<<endl;
		cin>>balance;
		cin.get();
		accountList[count] = Account(count+1,getName,balance);
		cout<<"Do you want to add more accounts ? Type y/n "<<endl;
		cin>>ch;
		cin.get();
		count++;
	}while(ch!='n'&&ch!='N');

	return count;
}
Account findAccount(int accountNumber,int numberOfValidAccounts,Account *listOfAccount){
      	for(int i = 0 ; i<numberOfValidAccounts ; ++i){
		if(listOfAccount[i].getAccountNumber()==accountNumber)
			return listOfAccount[i];
	}
	return Account(-1,"No Account was found",0);
}
int main(){
	
	Account accountList[10000];
	cout<<"Welcome to Rushil Bank Pvt. Limited"<<endl;
	char toExitTheMenu;
	int countForAccountCreated = 0;
	do{
		int enterMenuOption;
		int accountNumber;
		Account account;
		cout<<"Please choose b/w the given options(Press 1,2,3) : "<<endl;
		cout<<"1. Create a new bank account "<<endl;
		cout<<"2. Display data of a bank account "<<endl;
		cout<<"3. Withdraw money to account "<<endl;
		cout<<"4. Deposit money from account "<<endl;
		cin>>enterMenuOption;	
		cin.get();	
		switch(enterMenuOption){
			case 1:
				countForAccountCreated = enterNewAccountOperation(accountList,countForAccountCreated);
				cout<<"New Account(s) created successfully"<<endl;
				break;
			case 2:
				cout<<"Enter account number"<<endl;
				cin>>accountNumber;
				account = findAccount(accountNumber,countForAccountCreated,accountList);
				account.DisplayData();
				break;
			case 3:
				int withdrawAmount;
				cout<<"Enter Account Number : "<<endl;
				cin>>accountNumber;
				account = findAccount(accountNumber,countForAccountCreated,accountList);
				if(account.getAccountNumber()>0){
					cout<<"Enter the money to withdraw : "<<endl;
					cin>>withdrawAmount;
					account.WithdrawAmount(accountNumber,withdrawAmount,account);
				}else cout<<"Account doesn't exist"<<endl;

				break;

			case 4:
				int depositAmount;
				cout<<"Enter Account Number : "<<endl;
				cin>>accountNumber;
				account = findAccount(accountNumber,countForAccountCreated,accountList);
				if(account.getAccountNumber()>0){
					cout<<"Enter the money to deposit : "<<endl;
					cin>>depositAmount;
					account.DepositAmount(accountNumber,depositAmount,account);
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
