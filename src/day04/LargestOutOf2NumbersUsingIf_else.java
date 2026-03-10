package day04;

import java.util.Scanner;

public class LargestOutOf2NumbersUsingIf_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("First Number i.e, " + a + " is largest number");
		} else {
			System.out.println("Second Number i.e, " + b + " is largest number");
		}

		sc.close();

	}

}
