package day17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ParamPractice pr = new ParamPractice();
		System.out.println("Intiating first method: ");
		pr.m1();
		System.out.println("Intiating second method: ");
		String s = pr.m2();
		System.out.println("The return value of second method: " + s);
		System.out.println("Intiating third method: ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value: ");
		int a = sc.nextInt();
		System.out.println("Enter second value: ");
		int b = sc.nextInt();
		System.out.println("The sum of value: ");
		pr.m3(a, b);

		System.out.println("Intiating fourth method: ");
		System.out.println("Enter radius: ");
		int r = sc.nextInt();
		System.out.println("The area of circle is: " + pr.m4(r));

		sc.close();

	}

}
