import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Practice {
    public static String[] properties() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/java/db.properties"));

        String dbUrl = properties.getProperty("url");
        String dbUsername = properties.getProperty("username");
        String dbPassword = properties.getProperty("password");

        return new String[]{dbUrl,dbUsername,dbPassword};
    }
    public static void main(String[] args){
        try{
            String[] properties = properties();
            try(
                    Connection connection = DriverManager.getConnection(properties[0],properties[1],properties[2]);
                    PreparedStatement psSelect = connection.prepareStatement("SELECT * FROM EMP");
                    ResultSet set = psSelect.executeQuery();
            ){
                if(connection.isValid(0)){
                    System.out.println("Connection made : " + connection.isValid(0));
                    while(set.next()){
                        System.out.println("Employee ID : " + set.getString(1));
                    }
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
