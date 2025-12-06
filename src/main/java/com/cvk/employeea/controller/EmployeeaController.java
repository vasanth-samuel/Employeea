package com.cvk.employeea.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cvk.employeea.entity.Employeea;
import com.cvk.employeea.service.EmployeeaService;

@RestController
public class EmployeeaController {

	@Autowired
	private EmployeeaService employeeaService;
	
	@PostMapping("/api/sam")
	public Employeea saveEmployeea(@RequestBody Employeea employeea) {
		return employeeaService.saveEmployeea(employeea);
	}
	
	
	@GetMapping("/api/abc/{id}")
	public Employeea getById(@PathVariable Long id) {
		return employeeaService.findById(id);
	}
	

	@GetMapping("api/dob/{dob}")
	public List<Employeea> getByLocalDate(@PathVariable LocalDate dob) {
		return employeeaService.findByDOB(dob);
	}
	
	@GetMapping("/api/efg")
	public List<Employeea> getAllEmployeea() {
		return employeeaService.findAll();
	}
	
	@PutMapping("/api/123/{id}")
	public Employeea updateEmployeea(@PathVariable Long id,@RequestBody Employeea employeea) {
		employeea.setId(id);
		return employeeaService.updateEmployeea(employeea);
	}
	
	@DeleteMapping("/api/deleteAll")
	public String deleteAllEmployeea() {
		employeeaService.deleteAll();
		return "done";
	}

	@DeleteMapping("/api/dlt/{id}")
	public String deleteById(@PathVariable Long id) {
		employeeaService.deleteEmployeeaById(id);
		return "emp delete sucfly";
	}
	
	
}
