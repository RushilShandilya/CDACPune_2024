package Onlineshopping;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
    public static Connection connection() throws IOException, SQLException, ClassNotFoundException {
        String propertiesPath = "/home/rushil/CDACPune_2024/Java/AdvancedJava/lab3/OnlineShopping/src/main/db.properties";

        Properties properties = new Properties();
        properties.load(new FileInputStream(propertiesPath));

        String dbUrl = properties.getProperty("url");
        String dbUsername= properties.getProperty("username");
        String dbPassword = properties.getProperty("password");

        Class.forName("org.mariadb.jdbc.Driver");
        return DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
    }
}
