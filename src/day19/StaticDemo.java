package day19;

public class StaticDemo {

	static int a;
	int b;

	static void m1(int c) {
		System.out.println("This is a static method which have a value: " + c);
	}

	void m2(int d) {
		System.out.println("This is a non static method which have a value: " + d);
	}

}
