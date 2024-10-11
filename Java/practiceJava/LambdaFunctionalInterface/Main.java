@FunctionalInterface
interface Sum{
	public int sum(int a, int b);
}
interface CheckStringIsEmpty{
	public boolean checkStringIsEmpty(String str);
}
interface convertUppercase{
	public String uppercase(String str);
}
interface convertLowercase{
	public String lowercase(String str);
}

class FunctionalInterfaceImplementation implements Sum,CheckStringIsEmpty{
	@Override
	public int sum(int a, int b){
		return 3*(a+b);
	}
	@Override
	public boolean checkStringIsEmpty(String str){
		return str.isEmpty();
	}

}
public class Main /*implements Sum*/{
	//@Override
	//public int sum(int a, int b){
	//	return 10*(a+b);
	//}
	public static void main(String... args){
		Sum sum = new Sum(){
			@Override
			public int sum(int a, int b){
				return a+b;
			}
		};

		CheckStringIsEmpty checkEmpty = new CheckStringIsEmpty(){
			@Override
			public boolean checkStringIsEmpty(String str){
				return str.isEmpty();
			}
		};

		CheckStringIsEmpty checkEmpty2 = (str)->str.isEmpty();
		System.out.println(checkEmpty2.checkStringIsEmpty("Final Flash"));
		
		Sum sum2=(a,b)->2*a+b;	

		System.out.println(sum.sum(10,5));
		System.out.println(sum2.sum(10,-4));
		SumImplement sumObj = new SumImplement();
		System.out.println(sumObj.sum(10,-5));
		//System.out.println(sum(10,5));	
	}
}
