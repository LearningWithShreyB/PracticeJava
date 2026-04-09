package day20;

interface A1 {
	int a1 = 10;
	int a2 = 20;

	default void m1() {
		System.out.println("This is m1 method from interface A1 which is a default method");
	}

	static void m2() {
		System.out.println("This is m2 method from interface A1 which is a static method");
	}

	void m3();

}

public class AbstractionPractice implements A1 {

	public void m3() {
		System.out.println("This is m3 method from interface A1 defined in main method which is an abstract method");
	}

	public void m4() {
		System.out.println("This is m4 method which is a normal method defined in main method");
	}

	int a3 = 30;

	public static void main(String[] args) {
		AbstractionPractice abs = new AbstractionPractice();
		System.out.println("First variable from interface A1: " + a1);
		System.out.println("Second variable from interface A1: " + a2);
		System.out.println("Third variable from class: " + abs.a3);

		abs.m1();
		A1.m2();
		abs.m3();
		abs.m4();

	}
}
