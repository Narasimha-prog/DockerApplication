package com.ln.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/date")
public class DateServlet extends HttpServlet {
@Override
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//set Content type
resp.setContentType("text/html");
//get Printwriter
PrintWriter writer=resp.getWriter();
Date date=new Date();
writer.println("<h1>Current Date And Time is"+date+"</h1>");
writer.println("<br><a href='index.jsp'>home</a>");

//close stream.....
writer.close();

}

}
