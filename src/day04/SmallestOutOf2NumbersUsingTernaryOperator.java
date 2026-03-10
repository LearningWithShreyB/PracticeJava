package day04;

import java.util.Scanner;

public class SmallestOutOf2NumbersUsingTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();

		int result = (a < b) ? a : b;

		if (result == a) {
			System.out.println("First Number i.e, " + a + " is smallest number");
		} else {
			System.out.println("Second Number i.e, " + b + " is smallest number");
		}

		sc.close();

	}

}
