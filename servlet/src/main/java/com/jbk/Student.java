package com.jbk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/* Backend code servlet */

@WebServlet("/submit")
public class Student extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String city = req.getParameter("city");
		long mob = Long.parseLong(req.getParameter("phone"));
		
		System.err.println(name);
		System.err.println(age);
		System.err.println(city);
		System.err.println(mob);
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>"+name+"<h1><br>");
		out.println("<h2>"+age+"<h2><br>");
		out.println("<h3>"+city+"<h3><br>");
		out.println("<h4>"+mob+"<h4>");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/tka_batch409","root","root");
			PreparedStatement ps =conn.prepareStatement("insert into temp_project(name, age, city, mob) values (?,?,?,?)");
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, city);
			ps.setLong(4, mob);
			ps.executeUpdate();
			out.println("Data is inserted...!");
			conn.close();

		}catch(Exception e) {
			e.printStackTrace();
			out.println("Error ="+e.getMessage());
		}



	}

}
