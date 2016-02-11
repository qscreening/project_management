package com.projectManagement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;  
import java.io.PrintWriter;
import javax.servlet.ServletException;  
     

@RestController
public class SignInController {

	@RequestMapping(value ="/signin", method = RequestMethod.POST)
	public boolean project(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
           	String emailId=request.getParameter("email");
		String password = request.getParameter("Password");
		User user=new User();
		SignInDao signInDao = new SignInDao();
		boolean result = signInDao.signInUserDetails(emailId, password);
		HttpSession session = request.getSession(true);  
		session.setAttribute("userId",user.getId());
		return result; 
	}

}
