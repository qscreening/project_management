package com.projectManagement;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Query;
 

@RestController
public class Project_managementController {
	@RequestMapping("/projectmanagement")
	public void management() {
		UserDao users = new UserDao();
		List list = users.getListOfUsers();
/*		request.setAttribute("user", list);
		request.getRequestDispatcher("table.jsp").forward(request, response);
*/		System.out.println(list);
	}
}


