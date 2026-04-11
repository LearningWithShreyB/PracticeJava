package day21;

public abstract class Shape01 {

	private String color;

	public abstract double area();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void display() {
		System.out.println("The value of color is: " + color);
	}

	class Rectangle extends Shape01 {
		private double length, width;

		public double area() {
			return length * width;
		}
	}

	abstract class Random extends Shape01 {
		void m1() {
			System.out.println("A random method creation which extends a abstract class and itself a abstract class.");
		}
	}

	public static void main(String[] args) {
		//Rectangle obj02 = new Rectangle();

	}

}
