package com.nit.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {

	public static void main(String[] args) {

		// Create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// Create session
		Session session = factory.openSession(); // Use openSession() instead of getCurrentSession()

		try {
			// Create a student object
			System.out.println("Creating a new student object...");
			Student tempStudent = new Student("Dog", "animal", "dog@example.com");

			// Start a transaction
			session.beginTransaction();

			// Save the student object
			System.out.println("Saving the student...");
			session.save(tempStudent);

			// Commit the transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
			

		} catch (Exception e) {
			session.close(); // Close the session manually
			factory.close();
			e.getMessage();
		}
	}
}