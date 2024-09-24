import java.util.Scanner;
import java.util.Arrays;

public class sortAnArray{
	public static void main(String... args){
		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i<10 ; ++i){
			array[i] = sc.nextInt();
		}
		for(int i = 0 ; i<10 ; ++i){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		Arrays.sort(array);
		for(int i = 0 ; i<10 ; ++i){
			System.out.print(array[i] + " ");
		}
		return ;
	}
}
