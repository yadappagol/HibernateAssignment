package com.te.hibernatedemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateUsingDynamicQueryJPQLInHibernateUsingScannerClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Id :");
		int id=sc.nextInt();
		
		System.out.println("Enter your Name :");
		String name=sc.next();
		
		System.out.println("Enter your Place :");
		String place=sc.next();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String update = "update Student set name=:name,place=:place where id=:id ";

		Query query = manager.createQuery(update);

		query.setParameter("name", name);
		query.setParameter("place", place);
		query.setParameter("id", id);

		int result = query.executeUpdate();
		transaction.commit();
		System.out.println("updated Successfully..!!");
	}
}
