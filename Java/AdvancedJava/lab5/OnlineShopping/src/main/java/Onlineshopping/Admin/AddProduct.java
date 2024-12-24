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

@WebServlet("/Admin/addProduct")
public class AddProduct extends HttpServlet {
    Connection connection;
    PreparedStatement psAddProduct;

    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            String addProductSQL = "INSERT INTO Products VALUES(?,?,?,?,?,?);";
            connection = DatabaseConnection.connection();
            psAddProduct = connection.prepareStatement(addProductSQL);
        } catch (IOException | SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            psAddProduct.setString(1, request.getParameter("categoryId"));
            psAddProduct.setString(2, request.getParameter("productId"));
            psAddProduct.setString(3, request.getParameter("productName"));
            psAddProduct.setString(4, request.getParameter("productDescription"));
            psAddProduct.setString(5, request.getParameter("productPrice"));
            psAddProduct.setString(6, request.getParameter("productImageURL"));


            try(ResultSet set = psAddProduct.executeQuery()){
                if(set.next()) out.println("Product Added");
                else out.println("Product can't be added");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        try {
            if (psAddProduct != null) psAddProduct.close();
            if (connection != null) connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
