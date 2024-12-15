package Day1.q2;

public class Menu {
    public static void MainMenu(){
        System.out.println("1. Create Table");
        System.out.println("2. Display Column of Table");
    }
    public static void TableMenu(){
        System.out.println("1.1. Add Column");
        System.out.println("1.2. Set Primary Key");
        System.out.println("1.3. Save");
    }
    public static void ColumnMenu(){
        System.out.println("******Column Type********");

        System.out.println("CHAR");
        System.out.println("VARCHAR");
        System.out.println("INTEGER");
        System.out.println("DECIMAL");
        System.out.println("BOOLEAN");
    }
}
