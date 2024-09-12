#include<iostream>
#include<cmath>
using namespace std;

double findFirstRoot(double a, double b , double discriminant){
	return -1*(b+discriminant)/(2*a);
}
double findSecondRoot(double a, double b, double discriminant){
	return -1*(b-discriminant)/(2*a);
}

void findRoot(double a , double b , double discriminant){
	double root1,root2;
	root1 = findFirstRoot(a,b,discriminant);
	root2 = findSecondRoot(a,b,discriminant);
	cout<<root1<<" "<<root2;	
	return;
}
double findDiscriminant(double a , double b , double c){
	return sqrt(b*b-4*a*c);	
}
int main(){
	double a,b,c;
	cout<<"Enter coefficients of a,b,c = "<<endl;
	cin>>a;
	cin>>b;
	cin>>c;
	double D = findDiscriminant(a,b,c);
	if(D>=0) findRoot(a,b,D);
	else cout<<"Imaginary Roots"<<endl;
	return 0;
}
