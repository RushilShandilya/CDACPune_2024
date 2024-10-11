import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Main{
	public static void main(String... args){
		List<Student> listOfFullName = Arrays.asList(
			new Student("Rushil","Kumar" ,"Shandilya"),
			new Student("Jared" ,"Keith" , "Gunn"),
			new Student("Erlich","Kennedy","Bachmann"),
			new Student("Kya","Hi","Pata"),
			new Student("Bhrigu","Mahesh","Brahma")		
		);

		Collections.sort(listOfFullName);
		listOfFullName.forEach(System.out::println);

		System.out.println();
		//Collections.sort(listOfFullName,(a,b)->Student.compareByLastName(a,b));
	
		Collections.sort(listOfFullName,Student::compareByLastName);
		listOfFullName.forEach(s->System.out.println(s));	
	}
}
