package day25;

import java.util.Scanner;

public class NumberFormatExceptionPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program is started");

		System.out.println("Enter a string: ");
		String s1 = sc.nextLine();

		int a1 = Integer.parseInt(s1);
		System.out.println("Result is: " + a1);

		System.out.println("Program is completed");
		sc.close();

	}

}
