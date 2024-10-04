public class Main{
	public static int divideNumber(int dividend, int divisor) throws ArithmeticException{
		if(divisor == 0)
			throw new ArithmeticException("Can't divide by 0");
		return dividend/divisor;
	}
	public static void main(String... args){
		try{
			int x = divideNumber(5,0);
			System.out.println(divideNumber(5,1));
		}catch(ArithmeticException e){
			System.out.println("Exception : " + e.getMessage());
		}
		return ;
	}
}
