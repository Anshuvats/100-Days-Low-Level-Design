package javaOOPSBasics;

public class MainPerson {

	public static void main(String[] args) {
		Person p1=new Person("Anshu",25);
		Person p2=new Person("Manoj",26);
		
		System.out.println(p1.getName()+ " "+p1.getAge());
		System.out.println(p2.getName()+" "+p2.getAge());
		
		p1.setName("Subhash");
		p1.setAge(27);
		
		p2.setName("Jyoti");
		p2.setAge(23);
		
		System.out.println(p1.getName()+ " "+p1.getAge());
		System.out.println(p2.getName()+" "+p2.getAge());
	}
}
