import java.util.List;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Main{
	private static List<Integer> listOfInteger = DataUtils.createIntegerDummy();
	private static List<Double> listOfDouble = DataUtils.createDoubleDummy();
	private static List<String> listOfString = DataUtils.createStringDummy();
	
	public static void main(String... args){
		
		//When using Anonymous Inner Class -> Function<Integer> = new Function<Integer>
		//When using Lamba Expression use -> Function<Integer,Integer>
		
		Function<Integer,Integer> action_1 = new Function<Integer,Integer>(){
			@Override
			public Integer apply(Integer a){
				return a*10;
			}
		};
		
		Function<Integer,Integer> action = (a)->(a*2);
		
		for(Integer a : listOfInteger) System.out.print(a + " ");
		System.out.println();
		for(Integer a : listOfInteger)System.out.print(action.apply(a)+" ");
		
		//for(Double a : listOfDouble)System.out.print(action2.apply(a)+" ");
	
		//for(Integer a : listOfInteger){
		//	Integer x =(Integer)a->2*a;
		//	System.out.println(x);
		//}
		
		BiFunction<Integer,Integer,Integer> action2 = new BiFunction<Integer,Integer,Integer>(){
			@Override
			public Integer apply(Integer a,Integer b){
				return a+b;
			}
			
		};
		BiFunction<Integer,Integer,Integer> action3 = (a,b)->(Integer)a-(Integer)b;
		
		System.out.println();
		for(Integer a : listOfInteger) System.out.print(action2.apply(3*a,2*a) + " ");
		
		System.out.println();
		for(Integer a : listOfInteger) System.out.print(action3.apply(3*a,2*a) + " ");
	
		Predicate<String> action4 = new Predicate<String>(){
			@Override
			public boolean test(String a){
				return a.contains("ushil");
			}
		};
		
		System.out.println();
		listOfString.forEach(s->System.out.println(s));
		
		//listOfString.forEach(list);
		
		//listOfString.stream().filter(action4).forEach(System.out::println);
	}
}