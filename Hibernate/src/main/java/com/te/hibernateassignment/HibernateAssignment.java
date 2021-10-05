package com.te.hibernateassignment;

import java.util.Scanner;

public class HibernateAssignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			HibernateMain.first();
			System.out.println("\nDo you want to continue press : Yes");
			System.out.println("If you don't want to continue press : No\n");
			String option = sc.next();
			if (option.equals("yes") || option.equalsIgnoreCase("Y")) {
				HibernateMain.first();
			} else if (option.equals("no") || option.equalsIgnoreCase("N")) {
				System.out.println("****************Thank You***************");
				System.out.println("*******Welcome Again**************");
				System.exit(0);
			} else {
				System.err.println("Please enter a valid option...!!");
				sc.next();
				if (option.equals("yes") || option.equalsIgnoreCase("Y")) {
					continue;
				}
				if (option.equals("no") || option.equalsIgnoreCase("N")) {
					System.out.println("*******Thank You**************");
					System.out.println("*******Welcome Again**************");
					System.exit(0);
				}
				System.err.println("--------**Please start the process agian**----------");
				break;
			}

		}
		sc.close();
	}
}
