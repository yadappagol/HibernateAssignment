package com.te.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindByUsingDynamicQueryInHibernateUsingCommandLine {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		
		String findById = "from Student where id= :ID";
		Query query = manager.createQuery(findById);
		
		query.setParameter("ID", Integer.parseInt(args[0]));
		Student std = (Student) query.getSingleResult();
		System.out.println(std);
	}

}
