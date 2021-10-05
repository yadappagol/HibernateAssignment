package com.te.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateUsingDynamicQueryJPQLInHibernateUsingCommandLine {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String update = "update Student set name=:name,place=:place where id=:id ";

		Query query = manager.createQuery(update);

		query.setParameter("name", args[0]);
		query.setParameter("place", args[1]);
		query.setParameter("id", Integer.parseInt(args[2]));

		int result = query.executeUpdate();
		transaction.commit();
		System.out.println("updated Successfully..!!");
	}

}
