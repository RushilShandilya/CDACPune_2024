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

@WebServlet("/Products")
public class Products extends HttpServlet {
    Connection connection;
    PreparedStatement psProducts;

    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            String psProductsSQL = "SELECT * FROM Products Where categoryId=?";
            connection = DatabaseConnection.connection();
            psProducts = connection.prepareStatement(psProductsSQL);
        } catch (IOException | SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String categoryId=request.getParameter("categoryId");

        try {
            psProducts.setString(1, categoryId);

            HttpSession userSession = request.getSession(false);
            if(userSession==null){
                response.sendRedirect("index.html");
                return ;
            }
            try (ResultSet set = psProducts.executeQuery()) {
                out.println("<html>");
                out.println("<head>");
                out.println("<link rel='stylesheet' type='text/css' href='style.css'>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h2>Welcome, "+(String)userSession.getAttribute("userUsername")+"</h2>");
                out.println("<table>");
                out.println("<tr><th>CategoryID</th><th>ProductID</th><th>Name</th><th>Description</th><th>Price</th><th>ImageURL</th><th>Add To Cart</th></tr>");
                while (set.next()) {
                    String categoryID = set.getString(1);
                    String ID = set.getString(2);
                    String Name = set.getString(3);
                    String Description = set.getString(4);
                    String Price = set.getString(5);
                    String ImageURL = set.getString(6);

                    String href="AddCart?categoryId="+categoryID+"&productId="+ID+"&productPrice="+Price;

                    out.println("<tr>");
                    out.println("<td>" + categoryID + "</td>");
                    out.println("<td>" + ID + "</td>");
                    out.println("<td>" + Name + "</td>");
                    out.println("<td>" + Description + "</td>");
                    out.println("<td>" + Price + "</td>");
                    out.println("<td>" + ImageURL + "</td>");
                    out.println("<td><a href='"+href+"'>Add to Cart</a></td>");
                    out.println("</tr>");
                }
                out.println("</table>");
                out.println("</body>");
                out.println("</html>");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        try{
            if(psProducts!=null) psProducts.close();
            if(connection!=null) connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
