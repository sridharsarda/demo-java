package net.codejava.javaee;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
   private static final long serialVersionUID = 1L;
   
   /**
    * @see HttpServlet#HttpServlet()
    */
   public Hello() {
	   super();
   }
   
   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String yourName = request.getParameter("yourName");
	   
	   PrintWriter writer = response.getWriter();
	   writer.println("<h1>Hello " + yourName + "</h1>");
	   writer.close();    
   }
   
}
