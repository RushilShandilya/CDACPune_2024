package src.main;

import java.util.List;
import java.util.Arrays;

public class DataUtils{
	private static List<Integer> listOfIntegers;
	private static List<Double> listOfDouble;
	private static List<String> listOfString;

	public static List<Integer> createIntegerDummy(){
		listOfIntegers = Arrays.asList(12,51,10,8,15,30);
		return listOfIntegers;
	}
	public static List<Double> createDoubleDummy(){	
		listOfDouble = Arrays.asList(10.0,12.0,8.0,6.0,30.0);
		return listOfDouble;
	}
	public static List<String> createStringDummy(){	
		listOfString = Arrays.asList("Rushil","Sushil","Pushil","Mushil","Tushil","Kushil","Nushil");
		return listOfString;
	}
}
