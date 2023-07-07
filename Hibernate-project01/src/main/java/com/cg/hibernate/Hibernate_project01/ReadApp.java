package com.cg.hibernate.Hibernate_project01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.cg.hibernate.utils.HibernateUtils;

public class ReadApp {
	public static void main(String[] args) {

		SessionFactory sessionfactory = HibernateUtils.getSessionFactory();

		Session session = sessionfactory.openSession();
		session.beginTransaction();
		Employee emp = session.get(Employee.class, 5);
		session.getTransaction().commit();
		
		//System.out.println("Does song object managed by session - " + session.contains(emp));
		System.out.println(emp);
		session.close();
		
		
	}

}
