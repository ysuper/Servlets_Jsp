package chapter5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListenerTester extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType( "text/html" );
		PrintWriter out = response.getWriter();
		out.println("test context attributes set by listener<br>");
		Dog dog = (Dog) getServletContext().getAttribute( "dog" );
		out.println("Dog's breed is: " +dog.getBreed());
	}
}
