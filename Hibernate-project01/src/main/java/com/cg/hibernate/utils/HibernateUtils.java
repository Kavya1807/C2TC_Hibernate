package com.cg.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.cg.hibernate.Hibernate_project01.Employee;

public class HibernateUtils {
		
	private static  SessionFactory sessionfactory = null;
	public static SessionFactory getSessionFactory() {
		
		if(sessionfactory==null) 
		{		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		 sessionfactory = cfg.buildSessionFactory();//immutable
	}
		return sessionfactory;

	}
}
