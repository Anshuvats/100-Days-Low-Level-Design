package javaOOPSBasics;

public class Circle {

	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getCircumference() {
		return 2*3.14*radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}
