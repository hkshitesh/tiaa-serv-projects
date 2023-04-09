package upes;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloForm extends HttpServlet {
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {     
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();    
      out.println(request.getParameter("first_name"));  
      out.println(request.getParameter("last_name")); 
   }
}
