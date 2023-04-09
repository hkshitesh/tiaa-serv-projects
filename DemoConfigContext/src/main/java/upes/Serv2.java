package upes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Serv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Serv2() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		String Lname= config.getInitParameter("Last_Name");
		out.print("My Last Name is " +Lname);	
		
		ServletContext context = getServletContext();
		String FullName= context.getInitParameter("Full_Name");
		out.print(" My Full Name is : " +FullName);
	}
}
