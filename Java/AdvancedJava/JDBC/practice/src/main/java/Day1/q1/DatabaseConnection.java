package Day1.q1;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
    public static String[] getProperties() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/java/db.properties"));

        String dbUrl = properties.getProperty("url");
        String dbUsername = properties.getProperty("username");
        String dbPassword = properties.getProperty("password");

        return new String[]{dbUrl,dbUsername,dbPassword};
    }
    public static Connection databaseConnection() throws IOException, SQLException {
        String[] properties = getProperties();
        Connection connection = DriverManager.getConnection(properties[0],properties[1],properties[2]);
        return connection;
    }
}
