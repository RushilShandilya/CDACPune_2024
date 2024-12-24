package Onlineshopping.Users;

import Onlineshopping.Cart.CartItem;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/AddCart")
public class AddCart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        HttpSession userSession = request.getSession(false);
        if(userSession==null) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }

        String categoryId = request.getParameter("categoryId");
        String productId = request.getParameter("productId");
        String productPrice = request.getParameter("productPrice");

        CartItem cartItem = new CartItem(categoryId,productId,productPrice);
        List<CartItem> cartItems = (List<CartItem>) userSession.getAttribute("cart");

        if(cartItems==null){
            cartItems = new ArrayList<>();
            userSession.setAttribute("cart",cartItems);
        }
        cartItems.add(cartItem);
        response.sendRedirect("ListCart");
    }
}
