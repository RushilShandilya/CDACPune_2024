import java.util.Scanner;
import java.util.Random;

class Student{
	private static int count=1;
	private int studentRollNumber;
	private String studentName;
	private int studentAverageMarks;
		
	public Student(String studentName,int studentAverageMarks){
		this.studentRollNumber = count++;
		this.studentName = studentName;
		this.studentAverageMarks = studentAverageMarks;
	}
	public int getStudentRollNumber(){
		return this.studentRollNumber;
	}
	public String getStudentName(){
		return this.studentName;
	}
	public int getStudentAverageMarks(){
		return this.studentAverageMarks;
	}
	public String printData(){
			return ("Student[Name: " + this.getStudentName() 
				+" RollNumber: "+ this.getStudentRollNumber() 
				+" Marks: " +this.getStudentAverageMarks()
				+" ]");
	}
}

public class Main{
	public static void main(String... args){
		Student[] student = new Student[2];
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		for(int i = 0 ; i<2 ; ++i){
			System.out.println("Enter your name");
			String studentName = sc.nextLine();
			student[i] = new Student(studentName,random.nextInt(100));
		}
		
		for(int i = 0 ; i<2 ; ++i) System.out.println(student[i].printData());
		return ;
	}
}
