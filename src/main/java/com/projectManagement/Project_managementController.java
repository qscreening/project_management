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
	public List management() {
		Session session = HibernateSessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from USERS");
		List users = query.list();
		session.save(users);
		session.getTransaction().commit();
		return users;
	}
}


