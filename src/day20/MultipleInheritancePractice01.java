package day20;

public class MultipleInheritancePractice01 implements I1, I2 {

	public void m1() {
		System.out.println("This is a m1 method from I1 interface");
	}

	public void m2() {
		System.out.println("This is a m2 method from I2 interface");
	}

	public void m3() {
		System.out.println("This is a m3 method from child class");
	}

	int c1 = 300;

	public static void main(String[] args) {

		MultipleInheritancePractice01 mi01 = new MultipleInheritancePractice01();
		mi01.m1();
		mi01.m2();
		mi01.m3();
		System.out.println("The variable from I1 Interface: " + i1);
		System.out.println("The variable from I2 Interface: " + i2);
		System.out.println("The variable from Child class: " + mi01.c1);

	}

}
