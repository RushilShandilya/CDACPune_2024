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

@WebServlet("/Category")
public class Category extends HttpServlet {
    Connection connection;
    PreparedStatement psCategory;

    @Override
    public void init(ServletConfig config) throws ServletException {
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
        HttpSession userSession = request.getSession(false);
        if(userSession==null) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }
        List<Map<String,String>> resultList = new ArrayList<>();

        try(ResultSet set = psCategory.executeQuery()){
            while(set.next()){
                Map<String,String> result = new HashMap<>();

                result.put("ID",set.getString(1));
                result.put("Name",set.getString(2));
                result.put("Description",set.getString(3));
                result.put("ImageURL",set.getString(4));

                resultList.add(result);
            }
            request.setAttribute("Results",resultList);
            request.getRequestDispatcher("/WEB-INF/jsp/users/category.jsp").forward(request,response);
        }catch (SQLException e) {
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
