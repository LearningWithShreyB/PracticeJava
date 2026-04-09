package day21;

public class C2_MI extends C1 implements I1, I2, I3 {

	public void m1() {
		System.out.println("This is a m1 method from I1 interface which is a abstract method defined in main class.");
	}

	public void m3() {
		System.out.println("This is a m3 method from I2 interface which is a abstract method defined in main class.");
	}

	public void m10() {
		System.out.println("This is a m10 method defined in main class.");
	}

	@Override
	public void m4() {
		System.out.println("The m4 method again defined in child class due to its overidden nature.");
		I2.super.m4();
		I3.super.m4();
	}

	static void m11() {
		System.out.println("This is a static m11 method defined in main class.");
	}

	int c1 = 100;
	static int c2 = 200;
	final int c3 = 300;

	int c4 = 400;
	static int c5 = 500;
	final int c6 = 600;

	public void ParentVars() {
		System.out.println("Calling one method to achieve the values from parent class");
		System.out.println("The variable from parent class C1: " + super.c1);
		System.out.println("The static variable from parent class C1: " + super.c2);
		System.out.println("The final variable from parent class C1: " + super.c3);
	}

	public static void main(String[] args) {

		C2_MI obj = new C2_MI();

		System.out.println("The variable from interface I1: " + i1);
		System.out.println("The variable from interface I2: " + i2);
		System.out.println("The variable from parent class C1: " + obj.c1);
		System.out.println("The static variable from parent class C1: " + c2);
		System.out.println("The final variable from parent class C1: " + obj.c3);
		System.out.println("The variable from child class: " + obj.c1);
		System.out.println("The static variable from child class: " + c2);
		System.out.println("The final variable from child class: " + obj.c3);
		System.out.println("The variable from child class: " + obj.c4);
		System.out.println("The static variable from child class: " + c5);
		System.out.println("The final variable from child class: " + obj.c6);

		int c1 = 1000;
		int c2 = 2000;
		final int c3 = 3000;

		System.out.println("The variable from child class after updation: " + c1);
		System.out.println("The static variable from child class after updation: " + c2);
		System.out.println("The final variable from child class after updation: " + c3);

		obj.m1();
		I1.m2();
		obj.m3();
		obj.m4();
		I3.m5();
		obj.m6();
		obj.m7();
		m8();
		obj.m9();
		obj.m10();
		m11();

		obj.ParentVars();
		System.out.println("The static variable from parent class C1 without using suoer keyword: " + C1.c2);
	}

}
