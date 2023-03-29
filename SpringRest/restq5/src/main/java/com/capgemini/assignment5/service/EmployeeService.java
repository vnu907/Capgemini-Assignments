package com.capgemini.assignment5.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.assignment5.employee.Employee;
import com.capgemini.assignment5.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Optional<Employee> getEmployee(String employeeId) {
		return employeeRepository.findById(employeeId);
	}

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void deleteEmployee(String employeeId) {
		employeeRepository.deleteById(employeeId);
	}

	public List<Employee> getAllEmployee() {
		List<Employee> emp = new ArrayList<>();
		employeeRepository.findAll().forEach(emp::add);
		return emp;
	}

}
