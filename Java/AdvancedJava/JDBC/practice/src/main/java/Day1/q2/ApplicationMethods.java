package Day1.q2;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class ApplicationMethods {
    static String tableName;
    public static String createTable(Scanner sc){
        sc.nextLine();
        System.out.println("Enter Table Name for Table Creation : ");
        tableName = sc.nextLine();

        String createTableSQL ="CREATE TABLE IF NOT EXISTS " + tableName + "( ";

        return createTableSQL;
    }
    public static boolean doesTableExist(String tableName) throws SQLException, IOException {
        boolean doesTableExist;
        try(
                Connection connection = DatabaseConnection.databaseConnection();
                PreparedStatement checkIfTableExist=connection.prepareStatement("SHOW TABLES LIKE ?");
        ){
            checkIfTableExist.setString(1,tableName);
            doesTableExist = checkIfTableExist.execute();
        }
        return doesTableExist;
    }
    public static void AlterTable(String tableName,Scanner sc) throws SQLException, IOException {
            try (
                    Connection connection = DatabaseConnection.databaseConnection();
            ) {
                System.out.println("Enter the Column Name");
                String columnName = sc.nextLine();

                Menu.ColumnMenu();
                System.out.println("Enter The Column Type");
                String columnType = sc.nextLine().toUpperCase();
            }
    }
    public static String addColumn(String createTableSQL,Scanner sc) {
        sc.nextLine();
        System.out.println("Enter the Column Name");
        String columnName = sc.nextLine();

        Menu.ColumnMenu();
        System.out.println("Enter the Column Type");
        String columnType = sc.nextLine().toUpperCase();

        switch(columnType){
            case "CHAR":{
                System.out.println("Enter the size of char");
                int size = sc.nextInt();
                String columnSQL = columnName +" "+ columnType +'('+size+')'+",";
                createTableSQL = createTableSQL.concat(columnSQL);

                break;
            }
            case "VARCHAR":{
                System.out.println("Enter the size of Varchar");
                int size = sc.nextInt();

                String columnSQL = columnName +" "+ columnType+'('+size+')'+",";
                createTableSQL =  createTableSQL.concat(columnSQL);

                break;
            }
            case "INTEGER":{
                break;
            }
            case "DECIMAL":{
                System.out.println("Enter the decimal values");
                break;
            }
            case "BOOLEAN":{
                System.out.println("Enter the boolean values");
                break;
            }
        }

        return createTableSQL;
    }
    public static void createTableMaker(String createTableSQL,Connection connection){
        createTableSQL = createTableSQL.substring(0,createTableSQL.length()-1);
        createTableSQL = createTableSQL.concat(");");
        try(
            PreparedStatement ps = connection.prepareStatement(createTableSQL)
        ){
            System.out.println(createTableSQL);
            boolean isTableCreated = ps.execute();

            if(!isTableCreated) System.out.println("Table Created Successfully");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void setPrimaryKey(Scanner sc) throws SQLException, IOException {
        try(
            Connection connection = DatabaseConnection.databaseConnection();
        ){

            sc.nextLine();
            String primaryKey  = "ALTER TABLE "+tableName+" ADD PRIMARY KEY ";
            System.out.println("Enter Column Name");
            String columnName = sc.nextLine();
            primaryKey = primaryKey.concat("(").concat(columnName).concat(")").concat(";");
            System.out.println(primaryKey);
            try(
                PreparedStatement alterTable = connection.prepareStatement(primaryKey);
            ){
                int primaryKeyExist = alterTable.executeUpdate();
                System.out.println("Primary Key Exist : " + primaryKeyExist);
            }
        }
    }

    public static void DisplayTableColumns(Scanner sc) throws SQLException, IOException {
        sc.nextLine();
        System.out.println("Enter Table Name");
        tableName = sc.nextLine();
        String descTable = "DESC " + tableName + ";";
        System.out.println(descTable);
        try(
                Connection connection = DatabaseConnection.databaseConnection();
                PreparedStatement ps = connection.prepareStatement(descTable);
                ResultSet rs = ps.executeQuery();
        ){
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        }
    }
}
