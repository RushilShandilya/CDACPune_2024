package Day1.q2;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            do {
                Menu.MainMenu();
                SelectOptions.MainMenuOptions(sc);
                System.out.println("Do you want to continue (y or n)?");
            }while(Character.toLowerCase(sc.next().charAt(0))=='y');
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
