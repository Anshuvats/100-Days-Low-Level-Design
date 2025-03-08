package javaOOPSBasics;

public class MainEmployee {

	public static void main(String[] args) {
		Employee emp1=new Employee("Anshu","Software Engineer",80980.20);
		
		emp1.printEmployeeDetails();
		
		emp1.setName("Manoj");
		emp1.setTitle("Tester");
		emp1.setSalary(34000.40);
		
		emp1.printEmployeeDetails();
		
		System.out.println("Updated Salary "+emp1.increaseSalary(30));
		
	}

}
