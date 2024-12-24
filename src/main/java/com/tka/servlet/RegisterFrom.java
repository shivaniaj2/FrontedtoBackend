package com.tka.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 @WebServlet("/register")
public class RegisterFrom extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String FirstName =request.getParameter("First Name");
		String FatherName=request.getParameter("Father name");
		String LastName=request.getParameter("Last Name");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String address=request.getParameter("address");
		String gender=request.getParameter("gender");
		String Dob=request.getParameter("dob");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		String age=request.getParameter("age");
		String degree=request.getParameter("degree");
		String passingYear=request.getParameter("PassingYear");
		String password=request.getParameter("Password");
		String submit=request.getParameter("submit");
		String reset=request.getParameter("reset");
		
		
		System.out.println(FirstName);
		System.out.println(FatherName);
		System.out.println(LastName);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(Dob);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
		System.out.println(age);
		System.out.println(degree);
		System.out.println(passingYear);
		System.out.println(password);
		
		
	PrintWriter out=response.getWriter();
	out.println(FirstName);
	out.println(FatherName);
	out.println(LastName);
	out.println(email);
	out.println(mobile);
	out.println(address);
	out.println(gender);
	out.println(Dob);
	out.println(city);
	out.println(state);
	out.println(country);
	out.println(age);
	out.println(degree);
	out.println(passingYear);
	out.println(password);
	}
}
