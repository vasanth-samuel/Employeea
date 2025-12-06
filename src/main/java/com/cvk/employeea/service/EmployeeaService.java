package com.cvk.employeea.service;

import java.time.LocalDate;
import java.util.List;

import com.cvk.employeea.entity.Employeea;

public interface EmployeeaService {

	public Employeea saveEmployeea(Employeea employeea);
	public Employeea updateEmployeea(Employeea employeea);
	public void deleteEmployeeaById(Long id);
	public void deleteAll();
	public Employeea findById(Long id);
	public List<Employeea>findAll();
	public List<Employeea> findByDOB(LocalDate dob);
	public List<Employeea> findByDOJ(LocalDate doj);

}
