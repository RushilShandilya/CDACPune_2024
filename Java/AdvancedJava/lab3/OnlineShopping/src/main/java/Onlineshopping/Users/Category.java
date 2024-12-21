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
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/Category")
public class Category extends HttpServlet {
    Connection connection;
    PreparedStatement psCategory;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        try {
            String getCategorySQL = "SELECT * FROM Category";

            connection = DatabaseConnection.connection();
            psCategory = connection.prepareStatement(getCategorySQL);

        } catch (SQLException | IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String redirectUrl = "http://localhost:8080/OnlineShopping/Products";
        try(ResultSet set = psCategory.executeQuery()){

            HttpSession userSession = request.getSession(false);

            if(userSession==null){
                response.sendRedirect("index.html");
                return ;
            }
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel='stylesheet' type='text/css' href='style.css'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Welcome, "+(String)userSession.getAttribute("userUsername")+"</h2>");
            out.println("<table>");
            out.println("<tr><th>ID</th><th>Name</th><th>Description</th><th>ImageUrl</th></tr>");

            while (set.next()) {
                String id = set.getString(1);
                String name = set.getString(2);
                String description = set.getString(3);
                String imageURL = set.getString(4);

                out.println("<tr>");
                out.println("<td><a href='"+redirectUrl+"?categoryId="+id+"'>"+id +"</a></td>");
                out.println("<td>" + name + "</td>");
                out.println("<td>" + description + "</td>");
                out.println("<td>" + imageURL + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void destroy() {
        try{
            if(psCategory!=null) psCategory.close();
            if(connection!=null) connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
