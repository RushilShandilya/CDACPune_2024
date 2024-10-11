import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char toContinue;
		do{
			try{
				Functions.showMenu();
				Functions.chooseOption();
			}catch(AccountNotFoundException e){
				System.out.println("Account Not Found Exception : " + e.getMessage());
			}catch(MinimumBalanceException e){
				System.out.println("Minimum Balance Exception : " + e.getMessage());
			}
			toContinue = sc.next().charAt(0);
		}while(toContinue=='y' || toContinue=='Y');
	}
}