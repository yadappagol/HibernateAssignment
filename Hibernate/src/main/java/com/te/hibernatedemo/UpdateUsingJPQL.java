package com.te.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateUsingJPQL {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String update = "update Student set name='Abhi',mothername='Savita',place='Dandapura' where id=130";
//		String update = "delete from Student where id=130";
		Query query = manager.createQuery(update);
		int result = query.executeUpdate();
		transaction.commit();
		System.out.println("Updated Successfully...!!");
	}

}
