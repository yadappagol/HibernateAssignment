
package com.te.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindHibernate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student std = entityManager.getReference(Student.class, 20);

		System.out.println(std);
		
		System.out.println("/n*************************************************************/n");
		System.out.println("/n**********Student Details***********/n");
		
		System.out.println("Id :"+std.getId());
		System.out.println("Name :"+std.getName());
		System.out.println("Standard :"+std.getStandard());
		System.out.println("Father Name :"+std.getFathername());
		System.out.println("Mother Name :"+std.getMothername());
		System.out.println("Surname :"+std.getSurname());
		System.out.println("Place :"+std.getPlace());
	}

}
