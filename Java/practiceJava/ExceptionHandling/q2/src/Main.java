import java.lang.Exception;

class ThrowOddException extends Exception{
	ThrowOddException(){}
	ThrowOddException(String message){
		super(message);
	}
}
public class Main{
	public static int oddException(int number) throws ThrowOddException{
		if(number%2!=0) throw new ThrowOddException(number+" is odd");
		return number;
	}
	public static void main(String... args){
		try{
			System.out.println(oddException(2));
			System.out.println(oddException(3));
		}catch(ThrowOddException e){
			System.out.println("Error: " + e.getMessage());
		}
	}
}
