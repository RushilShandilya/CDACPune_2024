package lab2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/register")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("Username");
		String password = request.getParameter("Password");
		String name = request.getParameter("Name");
		String email = request.getParameter("Email");
		
		PrintWriter out = response.getWriter();
	
		out.println("<html>");
		out.println("<body>");
		out.println("<table>");
		
		out.println("<tr>");
		out.println("<th>Username</th><th>Password</th><th>Name</th><th>Email</th>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>"+userName+"</td>"
					+ "<td>"+password+"</td>"
					+ "<td>"+name+"</td>"
					+"<td>"+email+"</td>");
		out.println("</tr>");
			
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
		
		//doGet(request,response);
	}

}
