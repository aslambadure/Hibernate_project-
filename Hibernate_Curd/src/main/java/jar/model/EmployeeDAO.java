package jar.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDAO {
	// Create (Insert)
	public void saveEmployee(Employee employee) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(employee);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) transaction.rollback();
			e.printStackTrace();
		}
	}


	public List<Employee> getAllEmployees() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("from Employee", Employee.class).list();
		}
	}
}

