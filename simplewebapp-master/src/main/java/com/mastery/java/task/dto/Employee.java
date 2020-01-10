package com.mastery.java.task.dto;

@Entity(name = "Employees")
public class Employee {
    private Long EmployeeId;
    private String FirstName;
    private String LastName;
    private Gender Gender;
    
    public long getEmployeeId() {
    	return EmployeeId;
    	}
    
    public String getFirstName() {
    	return FirstName;
    	}
    
    public String getLastName() {
    	return LastName;
    	}
    
    public Gender getGender() {
    	return Gender;
    	}
   
}
