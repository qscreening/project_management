package com.projectManagement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;

import java.io.IOException;  

@RestController
public class SignInController {

	@RequestMapping(value ="/SignIn", method = RequestMethod.POST)
	public boolean signin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String emailId = request.getParameter("userId");
		String password = request.getParameter("Password");

		User user = new User();
		SignInDao signInDao = new SignInDao();
		boolean result = signInDao.signInUserDetails(emailId, password);

		HttpSession session = request.getSession(true);  
		session.setAttribute("userId",user.getId());

		return result; 

	}

}
