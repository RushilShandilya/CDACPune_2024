package src.jobseeker;

public enum Degree{
	BTECH("Bachelor in Technology"),
	BBA("Bachelor in Business Administration"),
	BCA("Bachelor in Computer Application");
	
	private String fullForm;
	Degree(String givenFullForm){
		this.fullForm = givenFullForm;
	}

	String getFullForm(){
		return this.fullForm;
	}
}
