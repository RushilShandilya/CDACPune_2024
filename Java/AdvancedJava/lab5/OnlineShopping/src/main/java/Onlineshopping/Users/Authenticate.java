package Onlineshopping.Users;

import Onlineshopping.DatabaseConnection;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;

@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
    Connection connection;
    PreparedStatement psAuthenticate;

    @Override
    public void init(ServletConfig config) throws ServletException {
        try {

            connection = DatabaseConnection.connection();
            String psAuthenticateSQL = "SELECT * FROM Users WHERE Username=? and Password=?";
            psAuthenticate=connection.prepareStatement(psAuthenticateSQL);

        } catch (IOException | RuntimeException | ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            psAuthenticate.setString(1,request.getParameter("Username"));
            psAuthenticate.setString(2,request.getParameter("Password"));

            try(ResultSet set = psAuthenticate.executeQuery()){
                if(set.next()){
                    HttpSession userSession = request.getSession();
                    userSession.setAttribute("Username",set.getString(1));

                    request.setAttribute("Username",set.getString(1));
                    request.getRequestDispatcher("/WEB-INF/jsp/users/welcome.jsp").forward(request,response);
                }else{
                    response.sendRedirect("index.html");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void destroy() {
        try{
            if(psAuthenticate!=null) psAuthenticate.close();
            if(connection!=null) connection.close();
        }catch(SQLException e){

        }
    }
}
