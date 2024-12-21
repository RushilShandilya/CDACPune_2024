package Onlineshopping.Users;

import Onlineshopping.Cart.CartItem;
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
import java.util.List;

@WebServlet("/ListCart")
public class ListCart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession userSession = request.getSession(false);

        if(userSession==null){
            response.sendRedirect("index.html");
            return ;
        }
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");

        for(CartItem item : (List<CartItem>)userSession.getAttribute("cart")){
            out.println("<table>");
            out.println("<tr><th>CategoryID</th><th>ProductID</th><th>Price<th></tr>");
            out.println("<tr>");
            out.println("<td>"+item.getCategoryId()+"</td>");
            out.println("<td>"+item.getProductId()+"</td>");
            out.println("<td>"+item.getProductPrice()+"</td>");
            out.println("</tr>");
            out.println("</table>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
