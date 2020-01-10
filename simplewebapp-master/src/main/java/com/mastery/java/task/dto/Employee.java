package com.mastery.java.task.dto;

@Entity(name = "employeedb")
public class Employee {
    private Long EmployeeId;
    private String FirstName;
    private String LastName;
    private Gender Gender;
    
    @EmployeeId
    public long getEmployeeId() {
    	return EmployeeId;
    	}
    
    public void setEmployeeId(Long EmployeeId) {
        this.EmployeeId = EmployeeId;
    }
    
    @FirstName
    public String getFirstName() {
    	return FirstName;
    	}
    
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
   
    @LastName
    public String getLastName() {
    	return LastName;
    	}
    
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    
    @Pol
    public Gender getGender() {
    	return Gender;
    	}
   
    public void setGender(Gender Gender) {
        this.Gender = Gender;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId='" + EmployeeId + '\'' +
                ", FirstName='" + FirstName + '\'' +
                "LastName='" + LastName + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}
