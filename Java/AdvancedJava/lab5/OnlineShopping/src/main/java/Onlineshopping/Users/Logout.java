package Onlineshopping.Users;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession userSession= request.getSession(false);
        if(userSession==null){
            request.getRequestDispatcher("index.jsp").forward(request,response);
            return ;
        }
        userSession.invalidate();
        response.setContentType("text/html");
        response.getWriter().println("<h2>You have been logged out<h2>");
    }
}
