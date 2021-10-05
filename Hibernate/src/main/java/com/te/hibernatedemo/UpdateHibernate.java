package com.te.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateHibernate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

//		 Student std = entityManager.find(Student.class, 10);
		// std.setPlace("Beeranagaddi");
		// std.setFathername("Basappa");
		// std.setMothername("VijaLaxmi");
//		 std.setSurname("Yadappagol");

//		 Student std = entityManager.find(Student.class, 20);
		// std.setFathername("Basappa");
		// std.setMothername("VijaLaxmi");
//		 std.setSurname("Yadappagol");

		// Student std = entityManager.find(Student.class, 30);
		// std.setFathername("Vittal");
		// std.setMothername("Rukmavva");
		// std.setSurname("Yadappagol");

		// Student std = entityManager.find(Student.class, 40);
		// std.setFathername("Vittal");
		// std.setMothername("Rukmavva");
		// std.setSurname("Yadappagol");

		// Student std = entityManager.find(Student.class, 50);
		// std.setFathername("Vittal");
		// std.setMothername("Rukmavva");
		// std.setSurname("Yadappagol");

//		Student std = entityManager.find(Student.class, 60);
//		std.setFathername("Bhimappa");
//		std.setMothername("Mahadevi");
//		std.setSurname("Yadappagol");
		
//		Student std = entityManager.find(Student.class, 100 );s
//		std.setSurname("Tubaki");
		
//		Student std = entityManager.find(Student.class, 110);
//		std.setSurname("Tubaki");
		
//		Student std = entityManager.find(Student.class, 120);
//		std.setSurname("Dabaaj");

		entityTransaction.commit();

	}

}
