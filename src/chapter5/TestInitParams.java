package chapter5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestInitParams extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType( "text/html" );;
		PrintWriter out = response.getWriter();
		out.println("test init parameters<br>");
		
		java.util.Enumeration e = getServletConfig().getInitParameterNames();
		while(e.hasMoreElements()) {
			out.println( "<br>param name = "+e.nextElement()+"<br>" );
		}
		out.println( "main email is "+getServletConfig().getInitParameter( "mainEmail" )+"<br>" );
		out.println( "admin email is "+getServletConfig().getInitParameter( "adminEmail" )+"<br>" );
		
		out.println( "admin email is "+getServletContext().getInitParameter( "adminEmail" )+"<br>" );
	}


}
