import java.util.Scanner;

public class InterestCalculator{
	static double simpleInterest(int p , int r , int t){
		return (p*r*t)/100;
	}
	static double compoundInterest(int p , int r , int t){
		double rate = Math.pow((1 + r/100),t);
		double total = p*rate;
		double compoundInterest = total-p;
		return compoundInterest;
	}
	static int getChoice(Scanner sc){
		System.out.println("Choose your option");	
		System.out.println("1. Simple Interest");
		System.out.println("2. Compound Interest");
		int getChoice = sc.nextInt();
		return getChoice;
	}
	static double doTheCalculation(int getChoiceNumber,double principal,double rate,double time){	
		switch(getChoiceNumber){
			case 1 : return (principal*rate*time)/100;
			case 2 : return ((principal)*Math.pow((1+rate/100),time)) - principal;
			default: return -1;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char toExit;
		int getChoiceNumber;
		double principal,rate,time;
		do{
			getChoiceNumber = getChoice(sc);	
			
			System.out.println("Enter Principal ");
			principal = sc.nextDouble();	
			
			System.out.println("Enter Rate ");
			rate = sc.nextDouble();

			System.out.println("Enter Time ");
			time = sc.nextDouble();

			System.out.println(doTheCalculation(getChoiceNumber,principal,rate,time));
			System.out.println("Do you want to continue?(y/n)");
			toExit = sc.next().charAt(0);
		}while(toExit=='y'|| toExit=='Y');
	}
}
