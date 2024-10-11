package src.main;

import java.util.List;
import java.util.function.Function;

public class Main{
	private static List<Integer> listOfInteger = DataUtils.createIntegerDummy();
	public static void main(String... args){
		Function action = new Function(){
			@Override
			public Integer apply(Object a){
				if(a instanceof Integer){
					return 2*(Integer)a;
				}
				return -1;
			}
		};
		for(Integer a : listOfInteger) System.out.print(a + " ");
		System.out.println();
		for(Integer a : listOfInteger)System.out.print(action.apply(a)+" ");

		//for(Integer a : listOfInteger){
		//	Integer x =(Integer)a->2*a;
		//	System.out.println(x);
		//}
	}
}
