package com.te.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HibernateInsert {

	public static void main(String[] args) {
		Student std = new Student();

		// std.setId(10);
		// std.setName("Sanju");
		// std.setStandard(8);
		// std.setFathername("Basappa");
		// std.setMothername("Vijayalaxmi");
		// std.setPlace("Beeranagaddi");

		// std.setId(20);
		// std.setName("Ashwini");
		// std.setPlace("Gokak");
		// std.setStandard(12);
		// std.setFathername("Basappa");
		// std.setMothername("Vijayalaxmi");
		// std.setPlace("Beeranagaddi");

		// std.setId(30);
		// std.setName("Shridevi");
		// std.setPlace("Ballobal");
		// std.setStandard(11);
		//

		// std.setId(40);
		// std.setName("Maheshwari");
		// std.setPlace("Ballobal");
		// std.setStandard(9);

		// std.setId(50);
		// std.setName("Bharamanna");
		// std.setPlace("Gokak");
		// std.setStandard(13);

		// std.setId(60);
		// std.setName("Yallappa");
		// std.setPlace("Kallolli");
		// std.setStandard(15);
		//

		// std.setId(70);
		// std.setName("Nishant");
		// std.setStandard(5);
		// std.setFathername("Manjunatha");
		// std.setMothername("Basavva");
		// std.setSurname("Pujeri");
		// std.setPlace("Khanatti");

		// std.setId(80);
		// std.setName("Nidhi");
		// std.setStandard(3);
		// std.setFathername("Manjunatha");
		// std.setMothername("Basavva");
		// std.setSurname("Pujeri");
		// std.setPlace("Khanatti");

		// std.setId(90);
		// std.setName("Rohan");
		// std.setStandard(4);
		// std.setFathername("Mahadev");
		// std.setMothername("Renuka");
		// std.setSurname("Tubaki");
		// std.setPlace("Bhiranatti");
		//
		// std.setId(100);
		// std.setName("Rashmi");
		// std.setStandard(1);
		// std.setFathername("Mahadev");
		// std.setMothername("Renuka");
		// std.setPlace("Bhiranatti");

		// std.setId(110);
		// std.setName("Vaishanvi");
		// std.setStandard(0);
		// std.setFathername("Mahadev");
		// std.setMothername("Renuka");
		// std.setPlace("Bhiranatti");

		// std.setId(120);
		// std.setName("Sanvi");
		// std.setStandard(2);
		// std.setFathername("Mahadev");
		// std.setMothername("Sangeeta");
		// std.setPlace("Ghataprabha");

		std.setId(130);
		std.setName("Abhi");
		std.setPlace("Dandapur");
		std.setStandard(2);
		std.setFathername("Husband");
		std.setMothername("Savita");
		std.setSurname("Dandapur");

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;

		factory = Persistence.createEntityManagerFactory("emp");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

		transaction.begin();
		manager.persist(std);
		transaction.commit();

	}

}
