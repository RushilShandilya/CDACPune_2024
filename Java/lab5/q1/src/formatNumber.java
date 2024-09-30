import java.util.Scanner;

public class formatNumber{
	static boolean checkValidation(StringBuilder input){
		for(int i = 0 ; i < input.length() ; ++i){
			char ch = input.charAt(i);
			if(ch!='+' && ch!='-' && !(ch>='0' && ch<='9'))
				return false;
		}
		for(int i = 0 ; i<input.length() ; ++i){
			char ch = input.charAt(i);
			if(!(ch>='0' && ch<='9'))
				input.deleteCharAt(i);
		}
		if(input.length()<10 || input.length()>12 || input.length()==11) return false;
		if(input.length()==12){
			char ch1 = input.charAt(0);
			char ch2 = input.charAt(1);
			if(ch1!='9') return false;
			if(ch2!='1') return false;
		}	
		return true;
	}
	static StringBuilder formatForLength10(StringBuilder number){
		char[] plusNineOne = {'+','9','1'};
		char[] dash = {'-'};
			
		//+91-987-654-3210

		number.insert(0,plusNineOne,0,plusNineOne.length);
		number.insert(3,dash,0,dash.length);
		number.insert(7,dash,0,dash.length);
		number.insert(11,dash,0,dash.length);

		return number;
	}
	static StringBuilder formatForLength12(StringBuilder number){
		char[] plus = {'+'};
		char[] dash = {'-'};
			
		number.insert(0,plus,0,plus.length);
		number.insert(3,dash,0,dash.length);
		number.insert(7,dash,0,dash.length);
		number.insert(11,dash,0,dash.length);
		
		return number;
	}
	static StringBuilder formatNumber(StringBuilder number){
		int lengthOfString = number.length();
		switch(lengthOfString){
			case 10:{
				return formatForLength10(number);
				}
			case 12:{
				return formatForLength12(number);
			}
		}
		return new StringBuilder();
	}

	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");	
		StringBuilder number = new StringBuilder(sc.nextLine());
		
		if(!checkValidation(number))
			System.out.println("Input entered is wrong");
		else number = formatNumber(number);
		
		System.out.println(number);
		return ;
	}
}
