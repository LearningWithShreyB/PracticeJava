package day26;

import java.util.Scanner;

public class FinallyBlockPractice01 {

	public static void main(String[] args) {

		System.out.println("Program is started");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();

		try {
			System.out.println("Result is: " + (100 / num));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally block initiated");
		}
		System.out.println("Program is completed");

		sc.close();

	}

}
