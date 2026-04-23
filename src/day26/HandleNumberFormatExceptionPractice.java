package day26;

import java.util.Scanner;

public class HandleNumberFormatExceptionPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program is started");

		System.out.println("Enter a string: ");
		String s1 = sc.nextLine();
		try {
			int a1 = Integer.parseInt(s1);
			System.out.println("Result is: " + a1);
		} catch (Exception e) {
			System.out.println("Exception handled");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Exception handled and finally block initiated");
		}

		System.out.println("Program is completed");
		sc.close();

	}

}
