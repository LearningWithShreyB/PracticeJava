package day19;

class Parent01 {

	int a1 = 10;
	int b1 = 20;
	int a2 = 30;
	int b2 = 40;

	void value() {
		System.out.println("The value of first variable in class Parent01: " + a1);
		System.out.println("The value of second variable in class Parent01: " + b1);
		System.out.println("The value of third variable in class Parent01: " + a2);
		System.out.println("The value of fourth variable in class Parent01: " + b2);
	}

	Parent01() {
		System.out.println("This is defaut constructor of class Parent01");
	}

	Parent01(int p1) {
		System.out.println("This is parameterized constructor of class Parent01 having value: " + p1);
	}
}

class Child01 extends Parent01 {
	int a2 = 50;
	int b2 = 60;

	@Override
	void value() {
		super.value();

		System.out.println("The value of first variable in class Child01: " + a1);
		System.out.println("The value of second variable in class Child01: " + b1);
		System.out.println("The value of third variable in class Child01: " + a2);
		System.out.println("The value of fourth variable in class Child01: " + super.b2);

	}

	Child01() {
		System.out.println("This is defaut constructor of class Child01");
	}

	Child01(int c1) {
		super(20);
		// System.out.println("This is parameterized constructor of class Child01 having
		// value: " + c1);
	}
}

public class SuperPractice01 {

	public static void main(String[] args) {

		Child01 cobj = new Child01();
		cobj.value();

		Child01 cobj01 = new Child01(20);
	}

}
