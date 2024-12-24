package Onlineshopping.Admin;

import Onlineshopping.DatabaseConnection;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/Admin/Authenticate")
public class Authenticate extends HttpServlet {
    Connection connection;
    PreparedStatement psAuthenticateAdmin;

    @Override
    public void init(ServletConfig config) throws ServletException {
        String psAuthenticateSQL = "SELECT * FROM Admin Where username=? and password=?";
        try {
            connection = DatabaseConnection.connection();
            psAuthenticateAdmin = connection.prepareStatement(psAuthenticateSQL);
        } catch (IOException | SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("Username");
        String password = request.getParameter("Password");

        try {
            psAuthenticateAdmin.setString(1,username);
            psAuthenticateAdmin.setString(2,password);

            try(ResultSet set = psAuthenticateAdmin.executeQuery()){
                if(set.next()){
                    HttpSession session = request.getSession();

                    session.setAttribute("username",username);
                    session.setAttribute("isLoggedIn",true);

                    response.sendRedirect("adminDashboard");
                }else{
                    response.sendRedirect("/OnlineShopping/admin.jsp");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
