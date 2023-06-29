package com.cg.hibernate.Hibernate_project01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.cg.hibernate.utils.HibernateUtils;

public class DeleteApp {
	public static void main(String[] args) {
		
		
		SessionFactory  sessionfactory = HibernateUtils.getSessionFactory();
		 
 
			Session session = sessionfactory.openSession();

			// load the object that i want to delete

			Employee emp = session.load(Employee.class, 13);
			session.beginTransaction();
			//delete the object
			session.delete(emp);
			session.getTransaction().commit();

	
		}
	
	
}
