package day26;

import java.util.Scanner;

public class HandleThrowKeywordPractice {

	void m1(int num) {
		if (num < 1) {
			throw new ArithmeticException(
					"Number is negative, choose some positive number for doing square of a number");
		} else {
			System.out.println("Square of a number: " + (num * num));
		}
	}

	public static void main(String[] args) {
		HandleThrowKeywordPractice obj1 = new HandleThrowKeywordPractice();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt();
		try {
			obj1.m1(num1);
		} catch (Exception e) {
			System.out.println("Exception handled");
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
