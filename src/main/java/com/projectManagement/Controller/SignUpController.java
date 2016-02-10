package com.projectManagement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class SignUpController {

	@RequestMapping(value = "/SignUpController", method = RequestMethod.POST)
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String userName = request.getParameter("fullName");
		String emailId = request.getParameter("email");
		String password = request.getParameter("password");

		SignUpDao signUpDao = new SignUpDao();
		boolean status = signUpDao.signUpUserDetails(fullName, emailId, password);
		
		if (status) {
			request.getRequestDispatcher("home.html").forward(request, response);
		} else {
			request.getRequestDispatcher("index.html").forward(request, response);
		}

	}

}
