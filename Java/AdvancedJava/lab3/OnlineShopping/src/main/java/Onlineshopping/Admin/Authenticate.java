package Onlineshopping.Admin;

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("Username");
        String password = request.getParameter("Password");

        PrintWriter out = response.getWriter();

        try {
            psAuthenticateAdmin.setString(1,username);
            psAuthenticateAdmin.setString(2,password);

            String url = "http://localhost:8080/OnlineShopping/Admin/";

            try(ResultSet set = psAuthenticateAdmin.executeQuery()){
                if(set.next()){
                    out.println("<html>");
                    out.println("<body>");
                    out.println("<h2>Admin Dashboard</h2>");
                    out.println("<a href='"+url+"addCategory.html'>Add Category</a>");
                    out.println("<a href='addProduct.html'>Delete Category</a>");
                    out.println("<a href=''>Add Product</a>");
                    out.println("<a href=''>Add Card</a>");
                    out.println("</body>");
                    out.println("</html>");
                }else{
                    out.println("Can't Authenticate Admin");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
