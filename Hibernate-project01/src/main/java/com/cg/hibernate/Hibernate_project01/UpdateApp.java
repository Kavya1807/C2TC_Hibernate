package com.cg.hibernate.Hibernate_project01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.cg.hibernate.utils.HibernateUtils;

public class UpdateApp {
	public static void main(String[] args) {
		
		SessionFactory  sessionfactory = HibernateUtils.getSessionFactory();
		 
		
		Session session = sessionfactory.openSession(); 

		//updating all columns
		/*	Transaction tx = session.beginTransaction();
			Employee emp = new Employee();
			emp.setId(1);
			emp.setName("Sathya");
			emp.setSalary(8000000);
			session.update(emp);
			tx.commit();
			*/
			  
			// update single column  
			 Employee emp=  session.get(Employee.class,12);
			 emp.setSalary(2000000);
			 Transaction tx = session.beginTransaction();
			 session.update(emp);
			 session.getTransaction();
			 tx.commit();
			 session.close();
			 
			 
	}
		
}
