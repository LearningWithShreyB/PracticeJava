package day21;

public class MainChild {

	public static void main(String[] args) {

		Circle obj01 = new Circle(10, "Blue");

		System.out.println("Area of the shape is: " + obj01.area());
		
		Shape obj02=new Circle(20, "Red");
		
		System.out.println("Area of the shape is: " + obj02.area());

	}

}
