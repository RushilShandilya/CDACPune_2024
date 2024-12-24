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

@WebServlet("/Admin/addCard")
public class AddCard extends HttpServlet {
    Connection connection;
    PreparedStatement psAddCard;

    @Override
    public void init(ServletConfig config) throws ServletException {
        String addCard = "INSERT INTO CardDetails VALUES(?,?,?,?);";
        try {
            connection = DatabaseConnection.connection();
            psAddCard = connection.prepareStatement(addCard);

        } catch (IOException | ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            psAddCard.setString(1,request.getParameter("bankName"));
            psAddCard.setString(2,request.getParameter("cardNumber"));
            psAddCard.setString(3,request.getParameter("cardholderName"));
            psAddCard.setString(4,request.getParameter("expirationDate"));

            boolean value = psAddCard.execute();
            if(value==false) out.println("Card Details added");
            else out.println("Couldn't add details");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
