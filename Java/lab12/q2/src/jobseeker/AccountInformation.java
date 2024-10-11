package src.jobseeker;

public class AccountInformation{
	private int registrationID;
	private String email;
	private String password;

	private static int registrationIDGenerator = 0;
	public static final int firstValue = registrationIDGenerator;

	public AccountInformation(String email,String password){
		this.registrationID = ++registrationIDGenerator;
		this.email = email;
		this.password = password;
	}
	public int getRegistrationID(){
		return registrationID;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getPassword(){
		return password;
	}
}
