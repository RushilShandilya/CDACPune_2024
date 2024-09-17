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
		Account(int accountHolderID,string accountHolderName,double accountHolderBalance):accountHolderID(accountHolderID),accountHolderName(accountHolderName),accountHolderBalance(accountHolderBalance){++countObject;}
		void acceptData(){}
		void displayData(){
			cout<<"AccountHolderID : "<<this->accountHolderID<<endl;
			cout<<"Name : "<<this->accountHolderName<<endl;
			cout<<"Balance : "<<this->accountHolderBalance<<endl;
		}
		int getAccountHolderID(){
			return this->accountHolderID;
		}
		int getAccountHolderBalance() const{
			return this->accountHolderBalance;
		}
		void setAccountHolderBalance(int accountHolderBalance){
			this->accountHolderBalance = accountHolderBalance;
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
void getMenu(){
	cout<<"Welcome to Rushil Bank PVT Limited"<<endl;
	cout<<"Choose from the respective field below (1,2,3,4)"<<endl;
	cout<<"1.Create new account"<<endl;
	cout<<"2.Display data of an account"<<endl;
	cout<<"3.Withdraw amount from an account"<<endl;
	cout<<"4.Deposit amount to an account"<<endl;
}

Account* findAccount(int accountID, Account** listOfPointerForAccounts){
	for(int i = 0 ; i<=Account::countObject ; ++i){
		Account* temp = listOfPointerForAccounts[i];
		if(temp!=nullptr && temp->getAccountHolderID()==accountID)
			return listOfPointerForAccounts[i];
	}
	return nullptr;
}
void withdrawAmount(int accountID , Account** listOfPointerForAccounts,int amountToWithdraw){
	Account* addressOfDesiredAccount = findAccount(accountID,listOfPointerForAccounts);
	int remainingBalance=addressOfDesiredAccount->getAccountHolderBalance()-amountToWithdraw;
	if(addressOfDesiredAccount!=nullptr && remainingBalance>0)
		addressOfDesiredAccount->setAccountHolderBalance(remainingBalance);
	else cout<<"Not enough balance to withdraw"<<endl;
}

void depositAmount(int accountID, Account** listOfPointerForAccounts,int amountToDeposit){
	Account* addressOfDesiredAccount = findAccount(accountID,listOfPointerForAccounts);
	int newBalance = addressOfDesiredAccount->getAccountHolderBalance()+amountToDeposit;
	if(addressOfDesiredAccount!=nullptr)	
		addressOfDesiredAccount->setAccountHolderBalance(newBalance);
	return;
}

void displayData(int accountID, Account** listOfPointerForAccounts){
	Account* addressOfDesiredAccount = findAccount(accountID,listOfPointerForAccounts);
	
	if(addressOfDesiredAccount!=nullptr)addressOfDesiredAccount->displayData();	
	else cout<<"Null Pointer , can't show details"<<endl;
}
int enterAccountID(){
	int accountID;
	cout<<"Enter account ID "<<endl;
	cin>>accountID;
	return accountID;
}

void chooseOption(int selectOption,Account** listOfPointerForAccounts){
	int accountID;
	switch(selectOption){
		case 1:
			createAccount(listOfPointerForAccounts);
			break;
		case 2:
			accountID = enterAccountID();
			displayData(accountID,listOfPointerForAccounts);
			break;
		case 3:
			int amountToWithdraw;
			cout<<"Enter withdraw amount"<<endl;
			cin>>amountToWithdraw;
			accountID = enterAccountID();
			withdrawAmount(accountID,listOfPointerForAccounts,amountToWithdraw);
			break;
		case 4:
			int amountToDeposit;
			cout<<"Enter deposit amount"<<endl;
			cin>>amountToDeposit;
			accountID = enterAccountID();
			depositAmount(accountID,listOfPointerForAccounts,amountToDeposit);
			break;
		default:
			cout<<"Please enter correct option"<<endl;
	}
}

int Account::countObject=0;
int main(){
	Account* listOfPointerForAccounts[10000];
	char toExitTheMenu;
	int selectOption;
	do{
		getMenu();
		cin>>selectOption;
		cin.get();
		chooseOption(selectOption,listOfPointerForAccounts);
		cout<<"Do you want to exit program : Yes/No(y/n)"<<endl;
		cin>>toExitTheMenu;
	}while(toExitTheMenu!='y'&& toExitTheMenu!='Y');
	
	cout<<"Total Object Created :"<<Account::countObject<<endl;
	
	return 0;
}
