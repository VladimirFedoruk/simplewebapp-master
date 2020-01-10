package com.mastery.java.task.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class EmployeeControllerTest {
	@RequestMapping(method = RequestMethod.GET)
	public String helloWorld() {
		return "Hello, world!";
		}
}
