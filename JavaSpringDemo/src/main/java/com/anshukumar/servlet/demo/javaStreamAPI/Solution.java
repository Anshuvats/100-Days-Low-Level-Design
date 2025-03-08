package javaStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		
		List<Employee>employees=Arrays.asList(
				new Employee(1, "Alice", "HR", 55000, 28),
			    new Employee(2, "Bob", "IT", 70000, 32),
			    new Employee(3, "Charlie", "Finance", 80000, 45),
			    new Employee(4, "David", "IT", 65000, 26),
			    new Employee(5, "Eve", "HR", 72000, 41)
			    );
		// Filter employees with salary greater than 60000
		List<Employee>highEarners=employees.stream()
				.filter(e->e.getSalary()>60000)
				.collect(Collectors.toList());
		System.out.println("High Earner Employee: "+highEarners);
		
		//Sort employees by salary or age.
		List<Employee>sortedBySalary=employees.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println("Sort Employee on the basis of salary: "+sortedBySalary);
		
		//Sort employees by age.
		List<Employee>sortedByAge=employees.stream()
				.sorted(Comparator.comparingInt(Employee::getAge))
				.collect(Collectors.toList());
		System.out.println("Sort Employee By Age: "+sortedByAge);
		
		//getting a list of all employee names.
		List<String>employeeNames=employees.stream()
				.map(Employee::getName)
				.collect(Collectors.toList());
		System.out.println("List of all employee names: "+employeeNames);
		
		// Calculate the total salary
		double totalSalary=employees.stream()
				.mapToDouble(Employee::getSalary)
				.sum();
		System.out.println("Total Salary Of Employee :: "+totalSalary);
		
		// Calculate average salary
		double avgSalary=employees.stream()
				.mapToDouble(Employee::getSalary)
				.average()
				.orElse(0.0);
		System.out.println("Averge Salary Of Employee:: "+avgSalary);
		
		// Find employee with max salary
		Employee highEarnerEmp=employees.stream()
				.max(Comparator.comparingDouble(Employee::getSalary))
				.orElse(null);
		System.out.println("Employee who is earning highest :: "+highEarnerEmp);
		
		//GroupByEmployee
		Map<String,List<Employee>>groupByDepartment=employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("Grouping by department are : "+groupByDepartment);
		
		// Partition employees based on salary > 65000
		Map<Boolean,List<Employee>>partitionByEmployees=employees.stream()
				.collect(Collectors.partitioningBy(e->e.getSalary()>65000));
		System.out.println("Partition Employees Based on Salary: "+partitionByEmployees);
		
		// Count employees in each department
		Map<String, Long>countingEmployee=employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println("Count Employees in each Department are "+ countingEmployee);
		
		// Check if all employees have salary greater than 50000
		boolean allHighSalary=employees.stream()
				.allMatch(e->e.getSalary()>50000);
		System.out.println("All Employees have High Salary: "+allHighSalary);
		
		// Check if any employee is in HR
		boolean anyHRDepart=employees.stream()
				.anyMatch(e->e.getDepartment().equals("HR"));
		System.out.println("Any Department has HR Department :: "+anyHRDepart);
		
		// Sum of salaries using reduce
		double totalSalariesByReduceMethod=employees.stream()
				.map(Employee::getSalary)
				.reduce(0.0, Double::sum);
		System.out.println("Total Salary By Reduce Method : "+totalSalariesByReduceMethod);
		
		// Max of Salaries using reduce
		double maxSalary=employees.stream()
				.map(Employee::getSalary)
				.reduce(0.0, Double::max);
		System.out.println("Maximum Salary By Reduce Method: "+maxSalary);
		
		// Concatenate all employee names into a single string
		String concatenateNames=employees.stream()
				.map(Employee::getName)
				.collect(Collectors.joining(", "));
		System.out.println("Concatenate all Employee Names Into Single String :: "+concatenateNames);
		
		//Find Oldest and Youngest Employee
		Employee oldestEmp=employees.stream()
				.max(Comparator.comparingInt(Employee::getAge))
				.orElse(null);
		System.out.println("Oldest Employee " +oldestEmp);
		
		Employee youngestEmp=employees.stream()
				.min(Comparator.comparingInt(Employee::getAge))
				.orElse(null);
		System.out.println("Youngest Employee "+youngestEmp);
		
		//===============================================================================================//
		List<Integer>numbers=Arrays.asList(2,7,3,10,5,6,2,4,6);
		
		//Find the List of Even Number
		List<Integer>evenNumber=numbers.stream()
				.filter(e->e%2==0)
				.collect(Collectors.toList());
		System.out.println("Even Number: "+evenNumber);
		
		//Find the List of Odd Number
		List<Integer>oddNumber=numbers.stream()
				.filter(e->e%2!=0)
				.collect(Collectors.toList());
		System.out.println("Odd Number is "+oddNumber);
		
		// Find the maximum value in a list of integers.
		Optional<Integer>maxValue=numbers.stream()
				.max(Integer::compare);
		System.out.println("Maximum Value of List Of Integers : "+maxValue.get());
		
		// Calculate the sum of elements in a list of integers.
		int sumValue=numbers.stream()
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("Total Sum is :: "+sumValue);
		
		// Calculate the max of elements in a list of Integers
		int maxValue1=numbers.stream()
				.mapToInt(Integer::intValue)
				.max().orElse(0);
		System.out.println("MaxValue1 :: "+maxValue1);
		
		// Sort a list of integers in ascending order
		List<Integer>sortedList=numbers.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("Sort a List of Integer in Ascending order:: "+sortedList);
		
		// Sort a list of integers in Desceding order
		List<Integer>descSortedList=numbers.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("List of descSortedList :: "+descSortedList);
		
		// Count the number of elements in a list that are greater than 5.
		long cnt=numbers.stream()
				.filter(e->e>5)
				.count();
		System.out.println("Count the Number of elements in a list that are greater than 5 are :: "+ cnt);
		
		//Get a list of distinct elements from a list of integers.
		List<Integer>distinctElements=numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("List of Distinct Elements from a list of integers "+distinctElements);
		
		// Reduce a list of integers to their sum.
		int sumOfList=numbers.stream()
				.reduce(0, Integer::sum);
		System.out.println("Sum of List of Integer :: "+sumOfList);
		
		// Reduce a list of integers to their max.
		int maxOfList=numbers.stream()
				.reduce(0, Integer::max);
		System.out.println("Max of List of Integer :: "+maxOfList);
		
		// Return any element from a list of integers.
		Optional<Integer> findByAny=numbers.stream()
				.findAny();
		System.out.println("Find any element from List :: "+findByAny.get());
		
		// Check if all numbers in a list are positive.
		boolean allPositive=numbers.stream()
				.allMatch(e->e>0);
		System.out.println("All Numbers in a list are Positive :: "+allPositive);
		
		// Check if there are no negative numbers in a list.
		boolean noNegative=numbers.stream()
				.noneMatch(e->e<0);
		System.out.println("All Numbers in a list are negative :: "+noNegative);
		
		// Find the first element in a list of integers.
		Optional<Integer>firstElement=numbers.stream()
				.findFirst();
		System.out.println("Find First Element in a list of integers :: "+firstElement.get());
		
		// Print elements of a stream during processing without altering the stream.
		List<Integer>peekElements=numbers.stream()
				.peek(System.out::println)
				.collect(Collectors.toList());
		System.out.println("List of peek Elements are :: "+peekElements);
		
		// Limit the output to the first 3 elements of the list.
		List<Integer>limitedElements=numbers.stream()
				.limit(3)
				.collect(Collectors.toList());
		System.out.println("First 3 elements of the list are :: "+limitedElements);
		
		// Skip the first 2 elements of a list and return the rest.
		List<Integer>skippedElements=numbers.stream()
				.skip(2)
				.collect(Collectors.toList());
		System.out.println("Skip the first 2 elements of a list and return the rest:: "+skippedElements);
		
		// Convert a list of integers to a set to remove duplicates.
		Set<Integer>set=numbers.stream()
				.collect(Collectors.toSet());
		System.out.println("Convert a list of integers to a set to remove duplicates:: "+set);
		
		// Get summary statistics for a list of integers.
		IntSummaryStatistics stats=numbers.stream()
				.mapToInt(Integer::intValue)
				.summaryStatistics();
		System.out.println("Get summary statistics for a list of integers:: "+stats);
		
		//========================================================================
		
		List<List<Integer>>nestedNumbers=Arrays.asList(Arrays.asList(3,4),Arrays.asList(6,7,8));
		
		//Flatten a nested list structure.
		List<Integer>listOfIntegers=nestedNumbers.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println("List Of Integers are :: "+listOfIntegers);
		
		//=========================================================================
		
		List<String>names=Arrays.asList("Alice", "Bob", "Charlie");
		
		// Convert all strings in a list to uppercase.
		List<String>upperCaseNames=names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println("List of Uppercase Names:: "+upperCaseNames);
		
		// Convert all strings in a list to lowercase.
		List<String>lowerCaseNames=names.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		System.out.println("List of LowerCase Names:: "+lowerCaseNames);
		
		//=============================================================================
		
		List<String>fullNames=Arrays.asList("Alice Johnson", "Bob Harris", "Charlie Lou");
		
		// Extract first names from a list of full names.
		List<String>firstNames=fullNames.stream()
				.map(name->name.split(" ")[0])
				.collect(Collectors.toList());
		System.out.println("List of FirstName:: "+firstNames);
		
		// Extract last names from a list of full names.
		List<String>lastNames=fullNames.stream()
				.map(name->name.split(" ")[1])
				.collect(Collectors.toList());
		System.out.println("List of LastName:: "+lastNames);
		
	}

}
