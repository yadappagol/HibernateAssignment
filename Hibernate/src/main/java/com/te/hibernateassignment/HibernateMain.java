package com.te.hibernateassignment;

import java.io.Closeable;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.hibernatedemo.Student;

public class HibernateMain {
	static EntityManagerFactory factory;
	static EntityManager manager;

	static Scanner sc = new Scanner(System.in);

	public static void displayAll() {
		try {
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			String findAll = "from Student";
			Query query = manager.createQuery(findAll);
			List<Student> list = query.getResultList();

			System.out.println(list);

			System.out.println("***********************************");
			for (Student student : list) {
				System.out.println(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();

	}

	public static void particularData() {
		System.out.println("Enter your Id : ");
		int id = sc.nextInt();

		try {
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();

			String findById = "from Student where id= :ID";
			Query query = manager.createQuery(findById);

			query.setParameter("ID", id);
			Student std = (Student) query.getSingleResult();
			System.out.println(std);
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
	}

	public static void delete() {
		System.out.println("Enter your Id : ");
		int id = sc.nextInt();

		try {
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			String update = "delete from Student where id=:id ";

			Query query = manager.createQuery(update);
			query.setParameter("id", id);

			int result = query.executeUpdate();
			transaction.commit();
			System.out.println("updated Successfully..!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
	}

	public static void first() {
		HibernateMain.constant();
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("\n======== All Data================\n");
			HibernateMain.displayAll();
			break;
		case 2:
			System.out.println("\n======== Particular Data================\n");
			HibernateMain.particularData();
			break;
		case 3:
			System.out.println("\n======== Updating Single data================\n");
			HibernateMain.constantData();
			break;
		case 4:
			System.out.println("\n======== Deleting  the data ================\n");
			HibernateMain.delete();
			break;
		case 5:
			System.exit(0);
		default:
			try {
				throw new InvalidValueException("Entered option is Wrong!!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

	public static void constantData() {
		System.out.println("\n***************** Particular data updation **************\n");
		System.out.println(" Press 1 to update the Name");
		System.out.println(" Press 2 to update the Place");
		System.out.println(" Press 3 to update the Standard");
		System.out.println(" Press 4 to update the Fathename");
		System.out.println(" Press 5 to update the Mothername");
		System.out.println(" Press 6 to update the Surname");
		System.out.println(" Press 7 to update the All the data");
		System.out.println(" Press 8 to Exit");

		System.out.println("====================================");

		try {
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();

			while (true) {
				System.out.println("Please Enter Your Choice...");
				int choice = sc.nextInt();
				int id;
				String update;
				Query query;
				int result;
				switch (choice) {

				case 1:
					System.out.println("Enter your Name :");
					String name = sc.next();

					System.out.println("Enter your Id :");
					id = sc.nextInt();

					transaction.begin();
					update = "update Student set name=:name where id=:id ";

					query = manager.createQuery(update);

					query.setParameter("name", name);
					query.setParameter("id", id);

					result = query.executeUpdate();
					transaction.commit();
					System.out.println(" Your name has been updated Successfully..!!");
					break;

				case 2:
					System.out.println("Enter your Place :");
					String place = sc.next();

					System.out.println("Enter your Id :");
					id = sc.nextInt();

					transaction.begin();
					update = "update Student set place=:place where id=:id ";

					query = manager.createQuery(update);

					query.setParameter("place", place);
					query.setParameter("id", id);

					result = query.executeUpdate();
					transaction.commit();
					System.out.println(" Your place has been updated Successfully..!!");
					break;

				case 3:
					System.out.println("Enter your Standard :");
					int standard = sc.nextInt();

					System.out.println("Enter your Id :");
					id = sc.nextInt();

					transaction.begin();
					update = "update Student set standard=:std where id=:id ";

					query = manager.createQuery(update);

					query.setParameter("std", standard);
					query.setParameter("id", id);

					result = query.executeUpdate();
					transaction.commit();
					System.out.println(" Your standard has been updated Successfully..!!");
					break;

				case 4:
					System.out.println("Enter your FatherName :");
					String fname = sc.next();

					System.out.println("Enter your Id :");
					id = sc.nextInt();

					transaction.begin();
					update = "update Student set fathername=:name where id=:id ";

					query = manager.createQuery(update);

					query.setParameter("name", fname);
					query.setParameter("id", id);

					result = query.executeUpdate();
					transaction.commit();
					System.out.println(" Your FatherName has been updated Successfully..!!");

					break;

				case 5:
					System.out.println("Enter your MotherName :");
					String mname = sc.next();

					System.out.println("Enter your Id :");
					id = sc.nextInt();

					transaction.begin();
					update = "update Student set mothername=:name where id=:id ";

					query = manager.createQuery(update);

					query.setParameter("name", mname);
					query.setParameter("id", id);

					result = query.executeUpdate();
					transaction.commit();
					System.out.println(" Your MotherName has been updated Successfully..!!");
					break;

				case 6:
					System.out.println("Enter your Surname :");
					String sname = sc.next();

					System.out.println("Enter your Id :");
					id = sc.nextInt();

					transaction.begin();
					update = "update Student set surname=:name where id=:id ";

					query = manager.createQuery(update);

					query.setParameter("name", sname);
					query.setParameter("id", id);

					result = query.executeUpdate();
					transaction.commit();
					System.out.println(" Your Surname has been updated Successfully..!!");
					break;

				case 7:
					System.out.println("Enter your Name :");
					String name1 = sc.next();

					System.out.println("Enter your Place :");
					String place1 = sc.next();

					System.out.println("Enter your Standard :");
					int standard1 = sc.nextInt();

					System.out.println("Enter your FatherName :");
					String fathername = sc.next();

					System.out.println("Enter your MotherName :");
					String mothername = sc.next();

					System.out.println("Enter your Surname :");
					String surname = sc.next();

					System.out.println("Enter your Id :");
					id = sc.nextInt();

					transaction.begin();
					update = "update Student set name=:name,place=:place,standard=:std,fathername=:fname,mothername=:mname,surname=:sname, where id=:id ";

					query = manager.createQuery(update);

					query.setParameter("name", name1);
					query.setParameter("place", place1);
					query.setParameter("std", standard1);
					query.setParameter("fname", fathername);
					query.setParameter("mname", mothername);
					query.setParameter("sname", surname);
					query.setParameter("id", id);

					result = query.executeUpdate();
					transaction.commit();
					System.out.println(" Your All data has been updated Successfully..!!");
					break;
				case 8:
					System.exit(0);
				default:
					try {
						throw new InvalidValueException("Entere data is not present in database!!");
					} catch (Exception e) {
						System.err.println("Inavalid Entry...!!");
					}
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();

	}

	public static void constant() {
		System.out.println("\n----------Welcome Student Database Management System ---------\n");
		System.out.println(" Press 1 to see all data");
		System.out.println(" Press 2 to see any particular data");
		System.out.println(" Press 3 to update any particular data");
		System.out.println(" Press 4 to delete data");
		System.out.println(" Press 5 to Exit");

		System.out.println("====================================");

		System.out.println("Please Enter Your Choice...");
	}

	public static void close() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}

	}

}