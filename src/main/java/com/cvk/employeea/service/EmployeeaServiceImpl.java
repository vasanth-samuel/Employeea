package com.cvk.employeea.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvk.employeea.entity.Employeea;
import com.cvk.employeea.repository.EmployeeaRepo;

@Service
public class EmployeeaServiceImpl implements EmployeeaService {

	@Autowired
	private EmployeeaRepo employeeaRepo;
	
	@Override
	public Employeea saveEmployeea(Employeea employeea) {
		return employeeaRepo.save(employeea);
	}

	@Override
	public Employeea updateEmployeea(Employeea employeea) {
		return employeeaRepo.save(employeea);
	}

	@Override
	public void deleteEmployeeaById(Long id) {
         employeeaRepo.deleteById(id);;
	}

	@Override
	public void deleteAll() {
		employeeaRepo.deleteAll();
	}
	@Override
	public Employeea findById(Long id) {
		return employeeaRepo.findById(id).get();
	}

	@Override
	public List<Employeea> findAll() {
		return employeeaRepo.findAll();
	}

	@Override
	public List<Employeea> findByDOB(LocalDate dob) {
		return employeeaRepo.findBydob(dob);
	}

	@Override
	public List<Employeea> findByDOJ(LocalDate doj) {
		return employeeaRepo.findBydoj(doj);
	}

}
