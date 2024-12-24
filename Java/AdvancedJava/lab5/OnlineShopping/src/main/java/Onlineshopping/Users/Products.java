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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/Products")
public class Products extends HttpServlet{
    Connection connection;
    PreparedStatement psAuthenticate;

    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            String authenticateSQL = "SELECT * FROM Products WHERE categoryId=?";

            connection = DatabaseConnection.connection();
            psAuthenticate = connection.prepareStatement(authenticateSQL);

        } catch (IOException | SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession userSession = request.getSession(false);
        if(userSession==null){
               response.sendRedirect("index.jsp");
               return ;
        }

        try {
            psAuthenticate.setString(1,request.getParameter("categoryId"));
            List<Map<String,String>> productsList = new ArrayList<>();

            try(ResultSet set = psAuthenticate.executeQuery()){
                while(set.next()){
                    Map<String,String> product = new HashMap<>();

                    product.put("CategoryID",set.getString(1));
                    product.put("ProductID",set.getString(2));
                    product.put("Name",set.getString(3));
                    product.put("Description",set.getString(4));
                    product.put("Price",set.getString(5));
                    product.put("ImageURL",set.getString(6));

                    productsList.add(product);
                }
                request.setAttribute("Products",productsList);
                request.getRequestDispatcher("/WEB-INF/jsp/users/product.jsp").forward(request,response);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}