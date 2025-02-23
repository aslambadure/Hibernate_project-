package com.model.Main;

import com.model.curd.StudentDAO;
import com.model.dao.Student;

public class HibernateCRUDTest {

	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();

		// Create Student
//		Student student = new Student("kanda", "kanda@example.com");
//		studentDAO.saveStudent(student);


		// Read Students
		System.out.println("Student List:");
		studentDAO.getStudents().forEach(System.out::println);

		// Update Student
	//	studentDAO.updateStudent(6, "kanda1", "kanda1@example.com");

		// Delete Student
		studentDAO.deleteStudent(6);


	}
}
