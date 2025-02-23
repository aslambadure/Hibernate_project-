package com.model.curd;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.dao.Student;
import com.model.util.HibernateUtil;

public class StudentDAO {


	//insert or create

	/*

	public void saveStudent(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
            System.out.println("Student saved successfully!");
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

	 */

	/*
	 //Update
	 public void updateStudent(int id, String newName, String newEmail) {
    Transaction transaction = null;
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        transaction = session.beginTransaction();
        Student student = session.get(Student.class, id);
        if (student != null) {
            student.setName(newName);
            student.setEmail(newEmail);
            session.update(student);
            transaction.commit();
            System.out.println("Student updated successfully!");
        }
    } catch (Exception e) {
        if (transaction != null) transaction.rollback();
        e.printStackTrace();
    }
}
	 */
	public List<Student> getStudents() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("from Student", Student.class).list();
		}
	}

	//Delete
	public void deleteStudent(int id) {
	    Transaction transaction = null;
	    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	        transaction = session.beginTransaction();
	        Student student = session.get(Student.class, id);
	        if (student != null) {
	            session.delete(student);
	            transaction.commit();
	            System.out.println("Student deleted successfully!");
	        }
	    } catch (Exception e) {
	        if (transaction != null) transaction.rollback();
	        e.printStackTrace();
	    }
	}


}