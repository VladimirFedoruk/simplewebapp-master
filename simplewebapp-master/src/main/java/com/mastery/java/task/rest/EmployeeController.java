package com.mastery.java.task.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mastery.java.task.dto.Employee;
import com.mastery.java.task.service.EmployeeService;
@RestController
public class EmployeeController {
	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping(value = "/{EmployeeId}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable("EmployeeId") String EmployeeId) {
	Employee employee = null;
	return employee;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	
}
