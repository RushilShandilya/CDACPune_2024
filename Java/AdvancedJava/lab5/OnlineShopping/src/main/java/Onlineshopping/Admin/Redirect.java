package Onlineshopping.Admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet({"/AdminAuthenticate","/Admin/AddCategory","/Admin/AddProduct","/Admin/AddCard","/Admin/DeleteCategory"})
public class Redirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String getServletPath = request.getServletPath();
        switch(getServletPath){
            case "/AdminAuthenticate":{
                request.getRequestDispatcher("/WEB-INF/jsp/admin/admin.jsp").forward(request,response);
                break;
            }
            case "/Admin/AddCategory":{
                request.getRequestDispatcher("/WEB-INF/jsp/admin/addCategory.jsp").forward(request,response);
                break;
            }
            case "/Admin/AddProduct":{
                request.getRequestDispatcher("/WEB-INF/jsp/admin/addProduct.jsp").forward(request,response);
                break;
            }
            case "/Admin/AddCard":{
                request.getRequestDispatcher("/WEB-INF/jsp/admin/addCard.jsp").forward(request,response);
                break;
            }
            case "/Admin/DeleteCategory":{
                request.getRequestDispatcher("/WEB-INF/jsp/admin/deleteCategory.jsp").forward(request,response);
                break;
            }
        }
    }
}
