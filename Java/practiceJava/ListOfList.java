import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class ListOfList{
	public static void main(String... args){
		List<List<Integer>> listOfList = new ArrayList<>();
		System.out.println(listOfList);
		
		HashMap<Integer,Integer> tryingHashMap = new HashMap<>();
		tryingHashMap.put(65,120);

		System.out.println(tryingHashMap);		
	}
}
