package upes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ReadCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    	      throws ServletException, IOException {
    	      Cookie[] cookies = null;
    	      cookies = request.getCookies();
    	      PrintWriter out = response.getWriter();
    	      String title = "Reading Cookies Example";    	         
    	      if( cookies != null ) {
    	         for (int i = 0; i < cookies.length; i++) {
    	            out.print(" Name : " + cookies[i].getName( ));
    	            out.print(" Value: " + cookies[i].getValue( ));
    	         }
    	      } else {
    	         out.println("No cookies founds");
	      }

    	   }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
