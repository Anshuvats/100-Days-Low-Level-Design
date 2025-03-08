package javaOOPSBasics;

public class MainTrafficLight {

	public static void main(String[] args) {
		TrafficLight t1=new TrafficLight("red",23);
		
		System.out.println("The light is red: "+t1.isRed());
		System.out.println("The light is green: "+t1.isGreen());
		
		t1.changeColor("green");
		
		System.out.println("The light is red: "+t1.isRed());
		System.out.println("The light is green: "+t1.isGreen());
	}
}
