package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class servlet1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");

		Cookie cookie = new Cookie("cusername", name);
		Cookie cookie2 = new Cookie("cpassword", password);

		resp.addCookie(cookie);
		resp.addCookie(cookie);

		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body><h1>" + "Welcome " + name + "</h1></body></html>");
		printWriter.write("<html><body><a href='servlet2'>Go to Servlet2</a></body></html>");

	}

}
