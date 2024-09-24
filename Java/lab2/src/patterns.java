import java.util.Scanner;
public class patterns{
	static void pattern1(int n){
		for(int i = 0 ; i<n ; ++i){
			for(int j = i ; j<n ; ++j) System.out.print("*");
			System.out.println();
		}
	}
	static void pattern2(int n){
		for(int i = 0 ; i<n ; ++i){
			for(int j = 0 ; j<=i ; ++j) System.out.print("*");
			System.out.println();
		}
	}
	static void pattern3(int n){
		for(int i = 0 ; i<n ; ++i){
			for(int j = i ; j<n ; ++j) System.out.print("*");
			for(int j = 0 ; j<i ; ++j) System.out.print(" ");
			for(int j = 0 ; j<i-1 ; ++j) System.out.print(" ");
			for(int j = i ; j<n ; ++j)if(j!=0) System.out.print("*");
			System.out.println();
		}
	}
	static void pattern4(int n){
		for(int i = 0 ; i<n ; ++i){
			if(i%2==0)for(int j = i ; j<n ; ++j) System.out.print("*");
			if(i%2==0)System.out.println();
		}
		for(int i = 0 ; i<=n ; ++i){
			if(i%2!=0 && i!=1)for(int j = 0 ; j<i ; ++j) System.out.print("*");
			if(i%2!=0 && i!=1)System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();

		pattern1(rows);
		System.out.println("-----------------------------");
		pattern2(rows);
		System.out.println("-----------------------------");
		pattern3(rows);
		System.out.println("------------------------------");
		pattern4(rows);
	}
}
