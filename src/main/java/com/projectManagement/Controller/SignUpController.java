package com.projectManagement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class SignUpController {

	@RequestMapping(value = "/SignUp", method = RequestMethod.POST)
	public boolean signUp(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String fullName = request.getParameter("fName");
		String emailId = request.getParameter("email");
		String password = request.getParameter("pswd");
System.out.println(fullName+"===================="+emailId+"====================="+password+"==========================");

		SignUpDao signUpDao = new SignUpDao();
		boolean status = signUpDao.signUpUserDetails(fullName, emailId, password);
		return status;

	}

}
