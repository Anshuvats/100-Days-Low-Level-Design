package javaOOPSBasics;

public class MainRectangle {

	public static void main(String[] args) {
		
		Rectangle rec=new Rectangle(5,3);
		
		System.out.println(rec.getPerimeter()+ " "+ rec.getArea());
		
		rec.setLength(7);
		rec.setWidth(9);
		
		System.out.println(rec.getPerimeter()+ " "+ rec.getArea());
	}

}
