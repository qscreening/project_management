package com.projectManagement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.util.ArrayList;

@RestController
public class SignInController {

	@RequestMapping(value ="/SignIn", method = RequestMethod.POST)
	public int signin(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String emailId = request.getParameter("userId");
		String password = request.getParameter("Password");
		List<User> list = new ArrayList<User>();

		User user = new User();
		SignInDao signInDao = new SignInDao();
		boolean result = signInDao.signInUserDetails(emailId, password);

		UserDao dao = new UserDao();
		list = dao.getUserObj(emailId);

		Authorization auth = new Authorization();
		int curUser = auth.checkOrCreateSession(request, list);

		return curUser;
	}

}
