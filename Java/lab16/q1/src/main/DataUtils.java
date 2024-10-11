package src.main;

public class DataUtils{
	private static List<Apple> listOfApple;
	public static List<Apple> createAppleData(){
		listOfApple = Arrays.asList(
					new Apple(10,"Red","Sweet"),
					new Apple(20,"Green","Sour"),
					new Apple(15,"Crimson","Salty"),
					new Apple(5,"Yellow","Slight Sweet"),
					new Apple(25,"RedYellowish","Nuetral")
				);
		return listOfApple;
	}
}
