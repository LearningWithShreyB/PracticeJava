package day26;

import java.util.Scanner;

public class HandleArithemeticExcptionPractice {

	public static void main(String[] args) {

		System.out.println("Program is started");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();

		try {
			System.out.println("Result is: " + (100 / num));
		} catch (ArithmeticException e) {
			System.out.println("Exception handled");
			System.out.println(e.getMessage());
		}
		System.out.println("Program is completed");

		sc.close();

	}

}
