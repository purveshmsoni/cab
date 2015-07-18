package com.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.project.dto.UserDetail;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		UserDetail user = new UserDetail();
		user.setUsername("purvesh");
		user.setCabinet("Cab1");
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

}
