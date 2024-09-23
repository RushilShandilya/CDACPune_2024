public class SumOfDigits{
	static int usingRecursion(int a){
		if(a==0) return 0;
		return usingRecursion(a/10)+a%10;
	}
	static int  usingLoop(int a){
		int sum = 0;
		while(a!=0){
			sum+=a%10;
			a=a/10;
		}
		return sum;
	}
	public static void main(String []args){
		System.out.println(usingRecursion(1234));
		System.out.println(usingLoop(1234));
	}
}
