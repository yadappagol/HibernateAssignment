package com.te.hibernatedemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAllJPQLImpl {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String findAll = "from Student";
		Query query = entityManager.createQuery(findAll);
		List<Student> list = query.getResultList();

		System.out.println(list);

		System.out.println("***********************************");
		for (Student student : list) {
			System.out.println(student);
		}

//		System.out.println("\n**************Fetching Single data using JPQL*********************\n");
//		String findOne = "from Student where id=30";
//		Query query1 = entityManager.createQuery(findOne);
//		Student std = (Student) query1.getSingleResult();
//
//		System.out.println(std);

	}
}
