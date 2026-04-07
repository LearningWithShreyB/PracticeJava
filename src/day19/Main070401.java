package day19;

import java.util.Scanner;

public class Main070401 {

	public static void main(String[] args) {

		StaticDemo.a = 15;
		System.out.println("The value of static variable without using object: " + StaticDemo.a);
		StaticDemo.m1(20);

		StaticDemo std = new StaticDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("The value of non static variable: ");
		std.b = sc.nextInt();
		std.m2(30);
		System.out.println("The value of static variable using object: ");
		std.a = sc.nextInt();
		System.out.println("The value of static method using object: ");
		std.m1(51);

		sc.close();

	}

}
