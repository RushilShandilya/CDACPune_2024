import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main{
	public static void main(String... args){
		List<String> listOfNames = Arrays.asList("Rushil","Rushil","lorem","ipsum","RUSHIL","asdassdjasd");
		
		Stream<String> q1 = listOfNames.stream().map(a->a.toLowerCase()).distinct();
		q1.forEach(System.out::println);
		System.out.println();

		Stream<String> q2 = listOfNames.stream()
						.filter(a->a.contentEquals(a.toUpperCase()));
		q2.forEach(System.out::println);
		System.out.println();

		Stream<String> q3 = listOfNames.stream()
						.filter(a->a.startsWith("R"));
		q3.forEach(System.out::println);
		System.out.println();


		Stream<String> q4 = listOfNames.stream();
		
	}
}
