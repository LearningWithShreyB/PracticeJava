package day26;

import java.util.Scanner;

public class ThrowKeywordPractice {

	void m1(int num) {
		if (num < 1) {
			throw new ArithmeticException(
					"Number is negative, choose some positive number for doing square of a number");
		} else {
			System.out.println("Square of a number: " + (num * num));
		}
	}

	public static void main(String[] args) {
		ThrowKeywordPractice obj1 = new ThrowKeywordPractice();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt();
		obj1.m1(num1);
		sc.close();

	}

}
