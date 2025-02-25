package jar.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "department")
	private String department;

	@Column(name = "salary")
	private Double salary;

	public Employee() {
		super();
	}

	public Employee(String name, String department, Double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	// Getters and Setters
	public Long getId() { 
		return id; 
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name; 
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department){
		this.department = department;
	}

	public Double getSalary(){
		return salary;
	}
	public void setSalary(Double salary) { 
		this.salary = salary; 
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
}