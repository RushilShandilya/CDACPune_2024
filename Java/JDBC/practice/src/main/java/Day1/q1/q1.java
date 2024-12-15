package Day1.q1;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
        try(
                Scanner scanner = new Scanner(System.in);
        ){
            do{
                Menu.printMenu();
                Menu.chooseOption(scanner);
                System.out.println("Do you want to continue?(y or n)");
            }while(Character.toLowerCase(scanner.next().charAt(0))=='y');
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
