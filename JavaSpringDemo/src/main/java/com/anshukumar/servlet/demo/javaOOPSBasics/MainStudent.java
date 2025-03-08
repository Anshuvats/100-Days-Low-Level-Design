package javaOOPSBasics;

public class MainStudent {

	public static void main(String[] args) {
		
		Student student1=new Student("Anshu",10);
		
		student1.printStudentDetails();
		
		student1.addCourse("Math");
		student1.addCourse("Science");
		student1.addCourse("Social Science");
		
		System.out.println(student1.getCourses());
		
		student1.removeCourse("Math");
		
		System.out.println(student1.getCourses());

	}

}
