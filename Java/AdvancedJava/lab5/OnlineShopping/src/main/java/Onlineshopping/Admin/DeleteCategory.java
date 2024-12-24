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
import java.sql.SQLException;

@WebServlet("/Admin/DeleteCategory")
public class DeleteCategory extends HttpServlet {

    Connection connection;
    PreparedStatement psDeleteStatement;
    PreparedStatement psDeleteProducts;

    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            String deleteStatementSQL = "DELETE FROM Category WHERE categoryId=?";
            String deleteProductSQL = "DELETE FROM Products WHERE categoryId=?";

            connection = DatabaseConnection.connection();
            psDeleteStatement = connection.prepareStatement(deleteStatementSQL);
            psDeleteProducts = connection.prepareStatement(deleteProductSQL);

        } catch (IOException |SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String categoryId = request.getParameter("categoryId");
        try{
           psDeleteStatement.setString(1,categoryId);
           psDeleteProducts.setString(1,categoryId);

           boolean value = psDeleteStatement.execute();

           if(value==false){
               out.println("Category Deleted");
               psDeleteProducts.execute();
           }
           else out.println("Category not deleted");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        try{
            if(psDeleteStatement!=null) psDeleteStatement.close();
            if(connection!=null) connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
