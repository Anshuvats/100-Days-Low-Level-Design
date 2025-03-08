package javaOOPSBasics;

import java.time.LocalDate;

public class MainEmployee1 {

	public static void main(String[] args) {
		
		Employee1 emp1=new Employee1("Anshu",89000.00,LocalDate.parse("2021-08-21"));
		
		System.out.println(emp1.getYearOfService());
		
		emp1.getEmployeeDetails();
		
		Employee1 emp2=new Employee1("Ankit",95000.00,LocalDate.parse("1999-10-16"));
		
        System.out.println(emp2.getYearOfService());
		
		emp2.getEmployeeDetails();
		
	}

}
