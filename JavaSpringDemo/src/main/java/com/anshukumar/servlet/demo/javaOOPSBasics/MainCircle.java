package javaOOPSBasics;

public class MainCircle {

	public static void main(String[] args) {
		Circle c1=new Circle(3.5);
		System.out.println(c1.getCircumference()+ " "+ c1.getArea());
		c1.setRadius(7.8);
		System.out.println(c1.getCircumference()+ " "+ c1.getArea());
	}
}
