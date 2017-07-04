package com.example.web;

	import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
	import java.util.*;

public class BeerSelect extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("Beer Selection Advice<br>");
//		String c = request.getParameter("color");
//			BeerExpert be = new BeerExpert();
//			List result = be.getBrands(c);
//		out.println("<br>Got beer color " + c);
//			Iterator it = result.iterator();
//			while(it.hasNext()) {
//				out.print("<br>try: " + it.next());
//			}
		
		String c = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);
		
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
//		response.sendRedirect( "result.jsp" );
		Enumeration<String> test=request.getHeaderNames();
		while (test.hasMoreElements()) {
			String headerName=test.nextElement();
			System.out.println("¡i"+headerName+"¡j"+request.getHeader(headerName));
		}
		System.out.println(request.getCookies());
		System.out.println(request.getSession());
		System.out.println(request.getMethod());
		System.out.println(request.getInputStream());
	}
}