package com.projectManagement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;

import java.util.List;
import java.util.ArrayList;

//import com.projectManagement.User;

public class Authorization{

        private HttpSession session = null;


	public static int sessionUser(){
		return 1;
	}

	public int checkOrCreateSession(HttpServletRequest request, List<User> list) throws ServletException {
		int curUser = 0;
		int userId = list.get(0).getId();
		if(session == null){
			session = request.getSession(true);
			session.setAttribute("userId", userId);
			curUser = (Integer)session.getAttribute("userId");
			return curUser;
		}else {
			System.out.println("session is Created");
		}
		return curUser;
	}
}
