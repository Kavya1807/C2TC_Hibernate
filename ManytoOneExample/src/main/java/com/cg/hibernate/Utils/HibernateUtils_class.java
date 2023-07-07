package com.cg.hibernate.Utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.cg.hibernate.ManytoOneExample.Address;
import com.cg.hibernate.ManytoOneExample.Employee;

public class HibernateUtils_class {
	
	private static  SessionFactory sessionfactory = null;
	public static SessionFactory getSessionFactory() {
		
		if(sessionfactory==null) 
		{		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Address.class);
		cfg.addAnnotatedClass(Employee.class);
		
		sessionfactory = cfg.buildSessionFactory();//immutable
	}
		return sessionfactory;

	}
}



