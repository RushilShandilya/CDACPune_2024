package src.main;

import src.apple.Apple;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Set;

public class Main{
	public static void main(String... args){
		List<Apple> listOfApple = DataUtils.createAppleData();

		Stream<Apple> filterByWeight = listOfApple.stream().filter(s->s.getWeight()>10);
		Stream<Apple> filterByColor = listOfApple.stream().filter(s->s.getColor().contains("Red"));
	
		listOfApple.forEach(System.out::println);
		System.out.println();

		filterByWeight.forEach(System.out::println);	
		System.out.println();
		filterByColor.forEach(System.out::println);
		
		Stream<Apple> filterByWeightAndColor = listOfApple.stream().filter(s->s.getWeight()>10).filter(s->s.getColor().contains("Red"));		  System.out.println();
		filterByWeightAndColor.forEach(System.out::println);

		Stream<Apple> filterByWeightAndColorAndTaste = listOfApple.stream().filter(s->s.getWeight()>10).filter(s->s.getColor().contains("Red")).filter(s->s.getColor().equals("Nuetral"));
		
		System.out.println();
		Stream<Apple> sortByWeight = listOfApple.stream().sorted((a,b)->(a.getWeight()>b.getWeight())?1:(a.getWeight()==b.getWeight())?0:-1);
		sortByWeight.forEach(System.out::println);
		
		System.out.println();
		Stream<Apple> sortByColor = listOfApple.stream().sorted((a,b)->(a.getColor().compareTo(b.getColor())));
		sortByColor.forEach(System.out::println);

		System.out.println();

		Stream<Apple> removeRed = listOfApple.stream().filter(s->!(s.getColor().contains("Red")));
		removeRed.forEach(System.out::println);

		System.out.println();

		Stream<Apple> removeGreen = listOfApple.stream().filter(s->!(s.getColor().contains("Green")));
		removeGreen.forEach(System.out::println);
		
		System.out.println();

		Set<Apple> convertToList = listOfApple.stream().collect(Collectors.toSet());
		convertToList.forEach(System.out::println);
	}
}
