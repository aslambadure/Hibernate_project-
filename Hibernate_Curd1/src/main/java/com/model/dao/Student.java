package com.model.dao;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    

	@Column(name = "name")
    private String name;
    
    @Column(name = "email")
    private String email;
    
    public Student() {}

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
 	public String toString() {
 		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
 	}
}