package com.cg.hibernate.test;

import org.hibernate.SessionFactory;

import com.cg.hibernate.utils.HibernateUtils;

public class Test {

	public static void main(String[] args) {

		SessionFactory sessionfactory1 = HibernateUtils.getSessionFactory();

		System.out.println(sessionfactory1);

	}

}
