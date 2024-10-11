import java.lang.Comparable;

public class Student implements Comparable<Student>{
	private String firstName;
	private String middleName;
	private String lastName;

	public Student(String firstName , String middleName , String lastName){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public String getFirstName(){
		return firstName;
	}
	public String getMiddleName(){
		return middleName;
	}
	public String getLastName(){
		return lastName;
	}
	@Override
	public String toString(){
		return "Name:[First=" + getFirstName()
			+" Middle=" + getMiddleName()
			+" Last=" + getLastName()
			+" ]";
	}

	@Override
	public int compareTo(Student other){
		return (this.getFirstName()).compareTo(other.getFirstName());
	}

	public static int compareByLastName(Student otherA, Student otherB){
		return (otherA.getLastName()).compareTo(otherB.getLastName());
	}
}
