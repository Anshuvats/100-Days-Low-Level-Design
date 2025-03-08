package javaOOPSBasics;

import java.time.LocalDate;
import java.time.Period;

public class Employee1 {

	private String name;
	private Double salary;
	private LocalDate hireDate;
	
	public Employee1(String name,Double salary,LocalDate hireDate) {
		this.name=name;
		this.salary=salary;
		this.hireDate=hireDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	public int getYearOfService() {
		return Period.between(hireDate, LocalDate.now()).getYears();
	}
	
	public void getEmployeeDetails() {
		System.out.println("Name of Employee "+name);
		System.out.println("Salary of Employee "+salary);
		System.out.println("Hire date of Employee "+hireDate);
	}
}
