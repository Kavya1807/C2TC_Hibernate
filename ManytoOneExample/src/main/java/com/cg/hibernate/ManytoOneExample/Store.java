package com.cg.hibernate.ManytoOneExample;

import org.hibernate.*;
import com.cg.hibernate.Utils.HibernateUtils_class;

public class Store {
	public static void main(String[] args) {

		SessionFactory sessionfactory = HibernateUtils_class.getSessionFactory();

		Session session = sessionfactory.openSession();

		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setName("Kavya");
		e1.setEmail("kavya12@gmail.com");

		Employee e2 = new Employee();
		e2.setName("Asha");
		e2.setEmail("ashu@gmail.com");

		
		Employee e3 = new Employee();
		e3.setName("Venba");
		e3.setEmail("venba12@gmail.com");

		Address address1 = new Address();
		address1.setAddressLine1("Electronic City");
		address1.setCity("Bangalore");
		address1.setState("Karnataka");
		address1.setCountry("India");
		address1.setPincode(675345);

		e1.setAddress(address1);
		e2.setAddress(address1);
		e3.setAddress(address1);

		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		t.commit();

		session.close();
		System.out.println("success");
	}
}