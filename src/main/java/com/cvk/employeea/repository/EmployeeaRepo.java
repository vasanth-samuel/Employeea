package com.cvk.employeea.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvk.employeea.entity.Employeea;

public interface EmployeeaRepo extends JpaRepository<Employeea, Long> {

	List<Employeea> findBydoj(LocalDate doj);
	List<Employeea> findBydob(LocalDate dob);
}
