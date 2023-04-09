package upes;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
// Extend HttpServlet class
public class HelloServ extends HttpServlet {
	
	
	public void init(ServletConfig config){   
		System.out.println("servlet is initialized phase");

	}


   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Create cookies for first and last names.      
      Cookie firstName = new Cookie("first_name", request.getParameter("first_name"));
      Cookie lastName = new Cookie("last_name", request.getParameter("last_name"));

      // Set expiry date after 24 Hrs for both the cookies.
      firstName.setMaxAge(0);
      lastName.setMaxAge(0);

      // Add both the cookies in the response header.
      response.addCookie( firstName );
      response.addCookie( lastName );

      // Set response content type
      response.setContentType("text/html");
 
      PrintWriter out = response.getWriter();
      String title = "Setting Cookies Example";     
      out.println(request.getParameter("first_name"));
   }
     
   public void destroy()
   {
	   System.out.println("servlet is destroyed");
   }   
}
