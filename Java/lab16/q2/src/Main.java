import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

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


		String str = listOfNames.stream().collect(Collectors.joining(""));
		System.out.println(str);

		Stream<String> q5 = listOfNames.stream().filter(a->a.endsWith("l"));
		q5.forEach(System.out::print);
		
	}
}
