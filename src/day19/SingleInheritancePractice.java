package day19;

import java.util.Scanner;

class A {
	int a;

	void show1() {
		System.out.println("The value of class A method is: " + a);
	}
}

class B extends A {
	int b;

	void show2() {
		System.out.println("The value of class B method is: " + b);
	}
}

public class SingleInheritancePractice {

	public static void main(String[] args) {
		B obj1 = new B();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		obj1.a = sc.nextInt();
		System.out.println("Enter a number: ");
		obj1.b = sc.nextInt();

		obj1.show1();
		obj1.show2();

		sc.close();

	}

}
