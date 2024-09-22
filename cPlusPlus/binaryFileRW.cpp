#include<iostream>
#include<fstream>

class MobilePhone{
	private:
		int modelNumber;
		std::string brandName;
		double price;
	public:
		static int countObject;
		MobilePhone(){}
		MobilePhone(int modelNumber, std::string brandName, double price):modelNumber(modelNumber),brandName(brandName),price(price){
			++countObject;
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
void WriteOnFile(MobilePhone* readDataFrom){
	std::ofstream theFileToWriteOn("example.txt",std::ios::binary);
	for(int i = 0 ; i<2 ; ++i){
		MobilePhone phone = readDataFrom[i];	
		theFileToWriteOn.write((char*)&phone,sizeof(MobilePhone));
	}
	theFileToWriteOn.close();
}
void ReadFromFile(MobilePhone* writeDataOn){
	std::ifstream theFileToReadFrom("example.txt",std::ios::binary);
	theFileToReadFrom.read((char*)&writeDataOn,sizeof(writeDataOn));
	theFileToReadFrom.close();
}

int MobilePhone::countObject=0;
int main(){
	MobilePhone readDataFrom[2];
	MobilePhone writeDataOn[2];
	
	std::string brandName;
	double price;

	for(int i = 0 ; i<2 ; ++i){
		std::cout<<"Enter the brandName: "<<std::endl;
		std::getline(std::cin,brandName);
		std::cout<<"Enter the price: "<<std::endl;
		std::cin>>price;
		std::cin.get();

		readDataFrom[i] = MobilePhone(MobilePhone::countObject+1,brandName,price);
	}

	WriteOnFile(readDataFrom);
	ReadFromFile(writeDataOn);

	for(int i = 0 ; i<2 ; ++i){
		std::cout<<"Model number: "<<writeDataOn[i].getModelNumber()<<std::endl;
		std::cout<<"Brand Name: "<<writeDataOn[i].getBrandName()<<std::endl;
		std::cout<<"Price: "<<writeDataOn[i].getPrice()<<std::endl;
	}

	return 0;
}
