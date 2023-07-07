package com.cg.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.cg.hibernate.OnetoManyExample.Answer;
import com.cg.hibernate.OnetoManyExample.Question;


public class Hibernate_utils {

	private static  SessionFactory sessionfactory = null;
	public static SessionFactory getSessionFactory() {
		
		if(sessionfactory==null) 
		{		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Answer.class);
		cfg.addAnnotatedClass(Question.class);
		
		sessionfactory = cfg.buildSessionFactory();//immutable
	}
		return sessionfactory;

	}
}


