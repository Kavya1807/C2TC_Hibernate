package com.cg.hibernate.ManytoOneExample;

import java.util.*;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cg.hibernate.Utils.HibernateUtils_class;

public class Fetch {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		SessionFactory sessionfactory = HibernateUtils_class.getSessionFactory();

		Session session = sessionfactory.openSession();

		TypedQuery query = session.createQuery("from Employee e");
		List<Employee> list = query.getResultList();

		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp.getEmployeeId() + ". " + emp.getName() + " " + emp.getEmail());
			Address address = emp.getAddress();
			System.out.println(address.getAddressLine1() + ", " + address.getCity() + ", " + address.getState() + ", "
					+ address.getCountry() + ", " + address.getPincode());
		}

		session.close();
		//System.out.println("success");
	}
}