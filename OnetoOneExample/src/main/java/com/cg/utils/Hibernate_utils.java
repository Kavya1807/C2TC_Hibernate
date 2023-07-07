package com.cg.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cg.hibernate.OnetoOneExample.Address;
import com.cg.hibernate.OnetoOneExample.Employee;


public class Hibernate_utils {

	private static  SessionFactory sessionfactory = null;
	public static SessionFactory getSessionFactory() {
		
		if(sessionfactory==null) 
		{		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Address.class);
		
		sessionfactory = cfg.buildSessionFactory();//immutable
	}
		return sessionfactory;

	}
}


