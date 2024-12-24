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

@WebServlet("/Admin/addCategory")
public class AddCategory extends HttpServlet {
    Connection connection;
    PreparedStatement psAddCategory;

    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            String addCategorySQL ="INSERT INTO Category VALUES(?,?,?,?);";
            connection = DatabaseConnection.connection();
            psAddCategory = connection.prepareStatement(addCategorySQL);
        }catch (IOException |SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String imageURL = request.getParameter("imageURL");


        System.out.println(id+" "+name+" "+description+" "+imageURL);

        try{
            psAddCategory.setString(1,id);
            psAddCategory.setString(2,name);
            psAddCategory.setString(3,description);
            psAddCategory.setString(4,imageURL);

            int value  = psAddCategory.executeUpdate();

            if(value==1)out.println("Category Inserted");
            else out.println("Couldn't insert category");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void destroy() {
        try{
            if(psAddCategory!=null) psAddCategory.close();
            if(connection!=null) connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
