#include<iostream>
#include<fstream>

class MobilePhone{
	private:
		int serialNumber;
		int modelNumber;
		std::string brandName;
		double price;
	public:
		static int countObject;
		MobilePhone(){}
		MobilePhone(int serialNumber,int modelNumber,std::string brandName,double price):
		serialNumber(serialNumber),
		modelNumber(modelNumber),
		brandName(brandName),
		price(price){
			++countObject;
		}
		int getSerialNumber() const{
			return this->serialNumber;
		}
		int getModelNumber() const{
			return this->modelNumber;
		}
		std::string getBrandName() const{
			return this->brandName;
		}
		double getPrice() const{
			return this->price;
		}
};
void writeInFile(MobilePhone* mobile){
	std::ofstream writeDataInFile("example.txt");
	int i = 0;
	do{
		writeDataInFile<<"Serial Number : "<<mobile[i].getSerialNumber()<<std::endl;
		writeDataInFile<<"Model Number : "<<mobile[i].getModelNumber()<<std::endl;
		writeDataInFile<<"Brand Name : "<<mobile[i].getBrandName()<<std::endl;
		writeDataInFile<<"Price : "<<mobile[i].getPrice()<<std::endl;
		

		++i;
	}while(i<2);

	std::cout<<"Successfully Created"<<std::endl;
}
void readFromFile(MobilePhone* mobile,MobilePhone* toStoreInArray){
	std::ifstream readDataFromFile("example.txt");
	std::string valuesToPrint;
	for(int i = 0 ; i<2 ; ++i){

		int count = 0;
		std::string brandName;
		int modelNumber,serialNumber;
		double price;
		
		while(std::getline(readDataFromFile,valuesToPrint)){
				if(count%4==0){
					std::string serialNumberTemp = valuesToPrint.substr(16,valuesToPrint.length());
					serialNumber = std::stoi(serialNumberTemp);
				}
				else if(count%4==1){
					std::string modelNumberTemp = valuesToPrint.substr(15,valuesToPrint.length());
					modelNumber = std::stoi(modelNumberTemp);
				}
				else if(count%4==2){
					std::string brandNameTemp = valuesToPrint.substr(13,valuesToPrint.length());
					brandName = brandNameTemp;
				}
				else if(count%4==3){
					std::string priceTemp = valuesToPrint.substr(8,valuesToPrint.length());
					price = std::stoi(priceTemp);
					break;
				}else std::cout<<"Wrong case "<<std::endl;
			
			std::cout<<"The count is : "<<count<<std::endl;
			++count;
		}
		toStoreInArray[i] = MobilePhone(serialNumber,modelNumber,brandName,price);
	}
}

int MobilePhone::countObject=0;
int main(){
	
	MobilePhone array[2];
	MobilePhone toStoreInArray[2];

	for(int i = 0 ; i<2 ; ++i){
		int modelNumber;
		std::string brandName;
		double price;

		std::cout<<"Model Number : "<<std::endl;
		std::cin>>modelNumber;
		std::cin.get();
		
		std::cout<<"Brand Name :"<<std::endl;
		std::getline(std::cin,brandName);

		std::cout<<"Price :"<<std::endl;
		std::cin>>price;

		array[i]=MobilePhone(MobilePhone::countObject+1,modelNumber,brandName,price);
	}
	char ch;
	do{
		std::cout<<"Writing in File"<<std::endl;
		writeInFile(array);
		readFromFile(array,toStoreInArray);
		std::cout<<"Do you want to continue?(y/n):"<<std::endl;
		std::cin>>ch;
		std::cin.get();
	}while(ch!='n'&&ch!='N');
	
	for(int i = 0 ; i<2 ; ++i){
		std::cout<<toStoreInArray[i].getSerialNumber()<<std::endl;
		std::cout<<toStoreInArray[i].getModelNumber()<<std::endl;
		std::cout<<toStoreInArray[i].getBrandName()<<std::endl;
		std::cout<<toStoreInArray[i].getPrice()<<std::endl;
	}

	for(int i = 0 ; i<2 ; ++i){
		for(int j = i+1 ; j<2 ; ++j){
			if(toStoreInArray[i].getPrice()>toStoreInArray[j].getPrice()){
				MobilePhone temp = toStoreInArray[i];
				toStoreInArray[i] = toStoreInArray[j];
				toStoreInArray[j] = temp;
			}
		}
	}

	for(int i = 0 ; i<2 ; ++i){
		std::cout<<toStoreInArray[i].getSerialNumber()<<std::endl;
		std::cout<<toStoreInArray[i].getModelNumber()<<std::endl;
		std::cout<<toStoreInArray[i].getBrandName()<<std::endl;
		std::cout<<toStoreInArray[i].getPrice()<<std::endl;
	}

	return 0;
}
