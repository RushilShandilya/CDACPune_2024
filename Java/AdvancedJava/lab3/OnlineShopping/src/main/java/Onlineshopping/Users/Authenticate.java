package Onlineshopping.Users;

import Onlineshopping.DatabaseConnection;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
    Connection connection;
    PreparedStatement psAuthenticate;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        try {
            String psAuthenticateSQL = "SELECT * FROM Users WHERE Username=? and Password=?";
            connection = DatabaseConnection.connection();
            psAuthenticate = connection.prepareStatement(psAuthenticateSQL);
        } catch (IOException | SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String username = request.getParameter("Username");
        String password = request.getParameter("Password");

        try {
            psAuthenticate.setString(1, username);
            psAuthenticate.setString(2, password);

            try (ResultSet set = psAuthenticate.executeQuery()) {
                if (set.next()) {
                    response.sendRedirect("Category");
                } else {
                    out.println("User Authentication Failed");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void destroy() {
        try {
            if (psAuthenticate != null) psAuthenticate.close();
            if (connection != null) connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
