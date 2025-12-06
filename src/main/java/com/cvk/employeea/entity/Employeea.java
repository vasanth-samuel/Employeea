package com.cvk.employeea.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Employeea {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String department;
	private String designation;
	private String exp;
	private double salary;
	private LocalDate dob;
	private LocalDate doj;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public Employeea(Long id, String name, String department, String designation, String exp, double salary,
			LocalDate dob, LocalDate doj) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.exp = exp;
		this.salary = salary;
		this.dob = dob;
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employyea [id=" + id + ", name=" + name + ", department=" + department + ", designation=" + designation
				+ ", exp=" + exp + ", salary=" + salary + ", dob=" + dob + ", doj=" + doj + "]";
	}
	public Employeea() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
