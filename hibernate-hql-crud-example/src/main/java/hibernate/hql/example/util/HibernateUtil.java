package hibernate.hql.example.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hibernate.hql.example.entity.Student;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();

				configuration.configure();

				configuration.addAnnotatedClass(Student.class);

				sessionFactory = configuration.buildSessionFactory();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}