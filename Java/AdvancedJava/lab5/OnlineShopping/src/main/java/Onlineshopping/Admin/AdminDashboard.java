package Onlineshopping.Admin;

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
import java.sql.SQLException;

@WebServlet("/Admin/adminDashboard")
public class AdminDashboard extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(false);
        if(session!=null && session.getAttribute("isLoggedIn").equals(true)){
                request.getRequestDispatcher("/WEB-INF/jsp/admin/adminDashboard.jsp").forward(request,response);
        }else{
            request.getRequestDispatcher("/WEB-INF/jsp/admin/admin.jsp").forward(request,response);
        }
    }
}
