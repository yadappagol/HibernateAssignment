package com.te.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HbernateDetachMethod {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityManager.detach(30);
//		entityManager.merge(30);

		entityTransaction.begin();
		Student std = entityManager.find(Student.class, 120);
		std.setSurname("DabaaJ");
//		entityManager.remove(std);
		entityTransaction.commit();

		System.out.println("Performed Successfully...!!");
	}

}
