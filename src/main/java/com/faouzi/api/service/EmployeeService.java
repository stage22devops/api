package com.faouzi.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faouzi.api.model.Employee;
import com.faouzi.api.repository.EmployeeRepository;

import lombok.Data;

@Service
@Data
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Optional<Employee> getEmployee(final Long id){
		return employeeRepository.findById(id);
	}
	
	public Iterable<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	public Employee saveEmployee(Employee employee) {
		Employee savedEmployee  = employeeRepository.save(employee);
		return savedEmployee;
	}
	
	public void deleteEmployee(final Long id) {
		employeeRepository.deleteById(id);
	}
}
