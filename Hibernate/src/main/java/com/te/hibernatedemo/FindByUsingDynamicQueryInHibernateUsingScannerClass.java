package com.te.hibernatedemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindByUsingDynamicQueryInHibernateUsingScannerClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Id : ");
		int id=sc.nextInt();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		
		String findById = "from Student where id= :ID";
		Query query = manager.createQuery(findById);
		
		query.setParameter("ID", id);
		Student std = (Student) query.getSingleResult();
		System.out.println(std);
	}
}
