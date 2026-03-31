package day17;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {

		ConstructorPractice cp1 = new ConstructorPractice();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Enter third number: ");
		int c = sc.nextInt();
		ConstructorPractice cp2 = new ConstructorPractice(a, b, c);

		System.out.println("Enter first number: ");
		int a1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int a2 = sc.nextInt();

		ConstructorPractice cp3 = new ConstructorPractice(a1, a2);

		sc.close();

	}

}
