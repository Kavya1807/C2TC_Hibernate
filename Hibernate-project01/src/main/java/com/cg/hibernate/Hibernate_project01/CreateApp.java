package com.cg.hibernate.Hibernate_project01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cg.hibernate.utils.HibernateUtils;

public class CreateApp {
	public static void main(String[] args) {
		try {
			SessionFactory sessionfactory = HibernateUtils.getSessionFactory();

			Session session = sessionfactory.openSession();

			Employee emp = new Employee();
			emp.setName("Shakthi");
			emp.setSalary(26000000);

			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
