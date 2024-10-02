import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String... args){
		ArrayList<Double> doubleList = new ArrayList<>(10);
		double sum = 0;
		int index = 0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter number");
			double number = sc.nextDouble();
			doubleList.add(index,number);
			sum+=number;
			++index;
		}while(index<10);

		System.out.println(doubleList+" "+sum);
		System.out.println(doubleList.indexOf((double)10));
		System.out.println(doubleList.lastIndexOf((double)10));

	}
}
