package Day1.q2;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectOptions {
    public static void MainMenuOptions(Scanner sc) throws SQLException, IOException {
        System.out.println("Choose Options : ");
        switch(sc.nextInt()){
            case 1:{
                String createTableSQL = ApplicationMethods.createTable(sc);
                do {
                    Menu.TableMenu();
                    TableMenuOptions(createTableSQL,sc);
                    System.out.println("Do you want to save changes? (Press 3 to save)");
                }while(sc.next().charAt(0)!='3');
                break;
            }
            case 2:{
                ApplicationMethods.DisplayTableColumns(sc);
                break;
            }
        }
    }
    public static void TableMenuOptions(String createTableSQL,Scanner sc) throws SQLException, IOException {
        System.out.println("Choose Options : ");
        switch(sc.nextInt()){
            case 1:{
                do {
                    createTableSQL = ApplicationMethods.addColumn(createTableSQL, sc);
                    System.out.println(createTableSQL);
                    System.out.println("Do you want to add more columns (y or n)");
                }while(Character.toLowerCase(sc.next().charAt(0))=='y');
                ApplicationMethods.createTableMaker(createTableSQL,DatabaseConnection.databaseConnection());
                break;
            }
            case 2:{
                ApplicationMethods.setPrimaryKey(sc);
                break;
            }
        }
    }
}
