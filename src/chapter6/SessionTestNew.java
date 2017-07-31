package chapter6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionTestNew")
public class SessionTestNew extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("test session attributes<br>");
		
		HttpSession session = request.getSession();
		
		if (session.isNew() ) {
			out.println("This is a new session.");
		} else {
			out.println("Welcome back!");
		}
		
//		HttpSession session2 = request.getSession(false);
//		if (session==null) {
//			out.println("no session was available");
//			out.println("making one...");
//			session2 = request.getSession();
//		} else {
//			out.println("there was a session!");
//		}
	}

}
