package com.cg.hibernate.OnetoOneExample;

import org.hibernate.*;

import com.cg.utils.Hibernate_utils;

public class Store {
	public static void main(String[] args) {

		SessionFactory sessionfactory = Hibernate_utils.getSessionFactory();

		Session session = sessionfactory.openSession();

		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setName("Kavya ");
		e1.setEmail("kavya@gmail.com");

		Address address1 = new Address();
		address1.setAddressLine1("Rajajinagar");
		address1.setCity("Bangalore");
		address1.setState("Karnataka");
		address1.setCountry("India");
		address1.setPincode(201301);

		e1.setAddress(address1);
		
		

		Employee e2 = new Employee();
		e2.setName("Parvathi");
		e2.setEmail("paru@gmail.com");

		Address address2 = new Address();
		address2.setAddressLine1("T-Nagar");
		address2.setCity("Chennai");
		address2.setState("TN");
		address2.setCountry("India");
		address2.setPincode(405601);

		e2.setAddress(address2);


		session.persist(e1);
     	session.persist(e2);
		t.commit();

		session.close();
		System.out.println("success");
	}
}