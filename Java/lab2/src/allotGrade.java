public class allotGrade{
	static String allotingGrade(int value){
			if(value<0 || value>100) return "Wrong Input";
			else if (value<=50) return "Pass Class";
			else if (value<=60) return "Second Class";
			else if (value<=75) return "First Class";
			else return "Distinction";
	}	
	public static void main(String... args){
		for(int i = 0 ; i<args.length ; ++i){
			System.out.println(allotingGrade(Integer.parseInt(args[i])));
		}	

		return ;
	}
}
	
