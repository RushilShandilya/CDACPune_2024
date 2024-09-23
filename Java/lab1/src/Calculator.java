import java.util.Scanner;

public class Calculator{
	public static double add(double a,double b){
		return a+b;
	}
	public static double subtract(double a,double b){
		return a-b;
	}
	public static double multiply(double a,double b){
		return a*b;
	}
	public static double divide(double a,double b){
		return a/b;
	}
	static int getChoice(Scanner input){
		
		System.out.println("Choose your option");
		System.out.println("1. Addition");	
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");

		int getChoice = input.nextInt();
		System.out.println("You selected choice " + getChoice);

		return getChoice;

	}
	static double doTheCalculation(int getChoice,double a,double b){
		switch(getChoice){
			case 1: return add(a,b);
			case 2: return subtract(a,b);	
			case 3: return multiply(a,b);
			case 4: return divide(a,b);
			default: return -1;
		}
	}
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		double firstNumber,secondNumber;
		int getChoiceNumber;
		char toExit;
		do{
			getChoiceNumber = getChoice(input);
			
			System.out.println("Enter the first number : ");	
			firstNumber = input.nextDouble();

			System.out.println("Enter the second number : ");
			secondNumber = input.nextDouble();

			System.out.println(doTheCalculation(getChoiceNumber,firstNumber,secondNumber));
			System.out.println("Do you want to exit?(y/n)");
			toExit = input.next().charAt(0);
		}while(toExit!='y' && toExit!='Y');	
	}

}
