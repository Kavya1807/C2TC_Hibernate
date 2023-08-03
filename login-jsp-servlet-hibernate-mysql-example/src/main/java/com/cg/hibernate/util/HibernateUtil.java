package com.cg.hibernate.util;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.cg.hibernate.model.User;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();

				// Hibernate settings equivalent to hibernate.cfg.xml's properties
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/ ");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "1234");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
				settings.put(Environment.AUTOCOMMIT, "false");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.HBM2DDL_AUTO, "update");

				configuration.setProperties(settings);
				configuration.addAnnotatedClass(User.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				System.out.println("Hibernate Java Config serviceRegistry created");
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
		
	}
}