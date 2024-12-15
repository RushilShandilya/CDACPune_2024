package Day1.q1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static Day1.q1.DatabaseConnection.databaseConnection;

public class Menu {
    public static void printMenu(){
        System.out.println("1.Register a user");
        System.out.println("2.List all Users based on city");
        System.out.println("3.Update password of a user");
        System.out.println("4.Display user information based on user name");
    }
    public static void chooseOption(Scanner sc) throws SQLException, IOException {
        switch(sc.nextInt()){
            case 1:{
                registerUser(sc,databaseConnection());
                break;
            }
        //    case 2:{
          //      listAllUser(sc,databaseConnection());
          //      break;
            //}
            //case 3:{
              //  updatePassword(sc,databaseConnection());
               // break;
           // }
            //case 4:{
              //  displayInformation(sc,databaseConnection());
               // break;
           //}
        }
    }
    public static void registerUser(Scanner sc , Connection connection) throws SQLException {
        sc.nextLine();
        System.out.println("Enter UserName of the User");
        String username = sc.nextLine();

        System.out.println("Enter Password of the User");
        String password = sc.nextLine();

        System.out.println("Enter Name of the User");
        String name = sc.nextLine();

        System.out.println("Enter Email of the User");
        String email = sc.nextLine();

        System.out.println("Enter City of the User");
        String city = sc.nextLine();

        PreparedStatement createTable = connection.prepareStatement("""
                CREATE TABLE IF NOT EXISTS jdbcTable(
                    username varchar(20) Primary Key,
                    password varchar(20) NOT NULL,
                    name varchar(20) NOT NULL,
                    email varchar(20) NOT NULL UNIQUE,
                    city varchar(20) NOT NULL
                );
                """);

        if(createTable.execute()) System.out.println("Table Created Successfully");

        PreparedStatement insertIntoTable = connection.prepareStatement("""
                INSERT INTO jdbcTable VALUES(?,?,?,?,?);
                """);
        insertIntoTable.setString(1,username);
        insertIntoTable.setString(2,password);
        insertIntoTable.setString(3,name);
        insertIntoTable.setString(4,email);
        insertIntoTable.setString(5,city);

        int rowsInserted = insertIntoTable.executeUpdate();
        System.out.println(rowsInserted + " the number of rows created");
    }
}
