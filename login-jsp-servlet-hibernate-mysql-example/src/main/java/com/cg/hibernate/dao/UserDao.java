package com.cg.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cg.hibernate.model.User;
import com.cg.hibernate.util.HibernateUtil;

public class UserDao {

	public void saveUser(User user) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(user);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public boolean validate(String user_name, String password) {

		Transaction transaction = null;
		User user = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// get an user object
			user = (User) session.createQuery("FROM User U WHERE U.user_name = :user_name")
					.setParameter("user_name", user_name).uniqueResult();

			if (user != null && user.getPassword().equals(password)) {
				return true;
			}

			// commit transaction
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return false;
	}

}