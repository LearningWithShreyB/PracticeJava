package day18;

import java.util.Scanner;

public class StaticProgram {

	static String a;
	String b;

	static void m1() {
		System.out.println("This is a static method");
	}

	void m2() {
		System.out.println("This is a non-static method");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		a = sc.nextLine();
		m1();
		StaticProgram sp = new StaticProgram();
		System.out.println("Enter a string: ");
		sp.b = sc.nextLine();
		sp.m2();

		sc.close();

	}

}
