package com.cg.hibernate.OnetoManyExample;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.cg.utils.Hibernate_utils;

public class StoreData {
	public static void main(String[] args) {

		SessionFactory sessionfactory = Hibernate_utils.getSessionFactory();

		Session session = sessionfactory.openSession();

		Transaction t = session.beginTransaction();

		Answer ans1 = new Answer();
		ans1.setAnswername("Java is a programming language");
		ans1.setPostedBy("Kavya P.S");

		Answer ans2 = new Answer();
		ans2.setAnswername("Java is a platform");
		ans2.setPostedBy("Kavya");

		Answer ans5 = new Answer();
		ans5.setAnswername("Java is a collection of objects");
		ans5.setPostedBy("Maha");

		Answer ans3 = new Answer();
		ans3.setAnswername("Servlet is an Interface");
		ans3.setPostedBy("Anjali");

		Answer ans4 = new Answer();
		ans4.setAnswername("Servlet is an API");
		ans4.setPostedBy("Anju");

		ArrayList<Answer> list1 = new ArrayList<Answer>();
		list1.add(ans1);
		list1.add(ans2);
		list1.add(ans5);

		ArrayList<Answer> list2 = new ArrayList<Answer>();
		list2.add(ans3);
		list2.add(ans4);

		Question question1 = new Question();
		question1.setQname("What is Java?");
		question1.setAnswers(list1);

		Question question2 = new Question();
		question2.setQname("What is Servlet?");
		question2.setAnswers(list2);

		session.persist(question1);
		session.persist(question2);

		t.commit();
		session.close();
		System.out.println("success");
	}
}