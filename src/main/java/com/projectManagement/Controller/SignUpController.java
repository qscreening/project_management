package com.projectManagement;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Query;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {
	@RequestMapping(value = "/SignUpController", method = RequestMethod.POST)

		SignUpDao signUpDao = new SignUpDao();
		int status = signUpDao.signUpUserDetails(user);
		
		if (status != 0) {
			response.sendRedirect("insertSuccess.html");
		} else {

			response.sendRedirect("insertFailure.html");
		}
}


