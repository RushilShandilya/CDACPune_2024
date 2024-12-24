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
        double totalPrice = 0;


        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table>");
        out.println("<tr><th>CategoryID</th><th>ProductID</th><th>Price<th></tr>");

        for(CartItem item : (List<CartItem>)userSession.getAttribute("cart")){

            out.println("<tr>");
            out.println("<td>"+item.getCategoryId()+"</td>");
            out.println("<td>"+item.getProductId()+"</td>");
            out.println("<td>"+item.getProductPrice()+"</td>");
            out.println("</tr>");

            totalPrice+=Double.parseDouble(item.getProductPrice());
        }
        out.println("</table>");

        out.println("Total Price : "+totalPrice);
        out.println("<a href='Category'>Continue Shopping</a>");
        out.println("<a href='Logout'>Logout</a>");

        out.println("</body>");
        out.println("</html>");
    }
}
