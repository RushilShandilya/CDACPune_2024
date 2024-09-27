class Methods{
	public static void printArray(int[] arr){
		for(int i = 0 ; i<arr.length ; ++i){
			System.out.println(arr[i] + " ");
		}
		return;
	}
	public static void printArray(String[] arr){
		for(int i = 0 ; i<arr.length ; ++i){
			System.out.println(arr[i] + " ");
		}
		return;
	}
}

public class OverloadedMethod{
	public static void main(String... args){
		int[] array1 = {0,1,2};
		String[] array2 = {"John Doe" , "Jane Doe" , "Rick Doe"};
		
		Methods.printArray(array1);
		Methods.printArray(array2);
		
		return ;
	}
}