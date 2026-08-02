package day31;

import java.util.Scanner;

public class FibonnacciSeries_2 {

	public static void printFibonnacci(int terms) {
		if (terms <= 0) {
			System.out.println("Invalid input");
			return;
		}

		int first = 0;
		int second = 1;

		for (int i = 0; i <= terms; i++) {

			int sum = first + second;
			System.out.println(sum);
			first = second;
			second = sum;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int numberOfTerms = sc.nextInt();
		printFibonnacci(numberOfTerms);
		sc.close();
	}

}
