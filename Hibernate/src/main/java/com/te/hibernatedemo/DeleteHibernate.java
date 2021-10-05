package com.te.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteHibernate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entitymanager.getTransaction();

		entityTransaction.begin();
		Student std = entitymanager.find(Student.class, 130);
		entitymanager.remove(std);
		entityTransaction.commit();
	}

}
