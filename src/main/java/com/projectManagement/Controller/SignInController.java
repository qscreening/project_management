package com.projectManagement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class SignInController {

	@RequestMapping(value ="/signin", method = RequestMethod.POST)
	public String project(HttpServletRequest request, HttpServletResponse response) throws Exception {
           	System.out.println("*******enter to controller******");
           	String user_Name=request.getParameter("userName");
		String password=request.getParameter("Password");
		System.out.println(password);
		return password;
	}

}
