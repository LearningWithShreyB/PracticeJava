package day19;

class A1 {

	int a1 = 10;
	int b1 = 20;
	int a2 = 30;
	int b2 = 40;

	void value() {
		System.out.println("The value of first variable in class A: " + a1);
		System.out.println("The value of second variable in class A: " + b1);
		System.out.println("The value of third variable in class A: " + a2);
		System.out.println("The value of fourth variable in class A: " + b2);
	}

	void m1() {
		System.out.println("This is normal method m1 of class A");
	}

	void m2() {
		System.out.println("This is normal method m2 of class A");
	}

	void m11(int c) {
		System.out.println("This is parameterized method m11 of class A which has some value: " + c);
	}

	void m22(int d) {
		System.out.println("This is parameterized method m22 of class A which has some value: " + d);
	}

	void m3(int e, int f) {
		int sum = e + f;
		System.out.println("This is parameterized method m3 of class A which has some value " + sum);
	}

	void m4(int g, int h) {
		int multiply = g * h;
		System.out.println("This is parameterized method m4 of class A which has some value " + multiply);
	}

}

class B1 extends A1 {
	int a2 = 50;
	int b2 = 60;

	@Override
	void value() {
		System.out.println("The value of first variable in class B: " + a1);
		System.out.println("The value of second variable in class B: " + b1);
		System.out.println("The value of third variable in class B: " + a2);
		System.out.println("The value of fourth variable in class B: " + b2);
	}

	@Override
	void m1() {
		System.out.println("This is override method m1 of class B");
	}

	void m22(int a, int b) {
		int multiply = a * b;
		System.out.println("This is parameterized overloaded method m22 of class B which has some value " + multiply);
	}

	@Override
	void m4(int c1, int c2) {
		int multiply = c1 * c2;
		System.out.println("This is parameterized override method m4 of class B which has some value " + multiply);
	}

	void m4(int d1) {
		double area = 22.7 * d1 * d1;
		System.out.println("This is parameterized overloaded method m4 of class B which has some value " + area);
	}

}

public class OverridingVSOverloadingPractice {

	public static void main(String[] args) {

		B1 bobj = new B1();
		bobj.value();
		bobj.a1 = 100;
		System.out.println("The value of first value while changed after object creation: " + bobj.a1);
		bobj.value();
		bobj.m1();
		bobj.m11(1000);
		bobj.m2();
		bobj.m22(200);
		bobj.m22(300, 350);
		bobj.m3(40, 80);
		bobj.m4(100);
		bobj.m4(40, 40);

	}

}
