package day20;

interface A2 {
	int a1 = 10;
	int a2 = 20;

	default void m1() {
		System.out.println("This is m1 method from interface A2 which is a default method");
	}

	static void m2() {
		System.out.println("This is m2 method from interface A2 which is a static method");
	}

	void m3();

}

public class AbstractionPracticeUsingInterfaceObj implements A2 {

	public void m3() {
		System.out.println("This is m3 method from interface A2 defined in main method which is an abstract method");
	}

	public void m4() {
		System.out.println("This is m4 method which is a normal method defined in main method");
	}

	int a3 = 30;

	public static void main(String[] args) {
		A2 abs01 = new AbstractionPracticeUsingInterfaceObj();
		System.out.println("First variable from interface A2: " + a1);
		System.out.println("Second variable from interface A2: " + a2);
		// System.out.println("Third variable from class: " + abs01.a3); not valid

		abs01.m1();
		A2.m2();
		abs01.m3();
//		abs01.m4();     not valid

	}
}
