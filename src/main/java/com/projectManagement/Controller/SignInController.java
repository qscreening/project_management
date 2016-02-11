package com.projectManagement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class SignInController {

	@RequestMapping(value ="/SignIn", method = RequestMethod.POST)
	public boolean project(HttpServletRequest request, HttpServletResponse response) throws Exception {
           	System.out.println("*******enter to controller******");
           	String email=request.getParameter("userName");
		String password=request.getParameter("Password");
		SignInDao signInDao = new SignInDao();
		boolean result = signInDao.signInUserDetails(email, password);
		return result;
	}

}
