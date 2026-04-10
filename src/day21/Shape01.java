package day21;

public abstract class Shape01 {

	int color;

	public abstract double area();

	public Shape01() {
		System.out.println("This is a constructor from Shape class");
	}

	public Shape01(int color) {
		this.color = color;
	}

	public void m1() {
		System.out.println("This is a normal method in Shape class");
	}

}
