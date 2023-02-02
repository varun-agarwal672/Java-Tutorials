package com.signup;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.signup.dao.SignupDao;

@WebServlet("/Signup")
public class Signup extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if(uname.isBlank() || pass.isBlank()) {
			
			response.sendRedirect("signup.jsp");
		}
		else {
			
			SignupDao dao = new SignupDao();
			
			if(dao.updateInfo(uname, pass)) {
				
				response.sendRedirect("login.jsp");
			}
			else {
				
				response.sendRedirect("signup.jsp");
			}
		}
	}

}
