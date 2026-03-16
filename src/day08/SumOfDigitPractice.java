package day08;

import java.util.Scanner;

public class SumOfDigitPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("The original number is: " + num);
		int sum = 0;
		int digits = 0;
		while (num > 0) {
			digits = num % 10;
			sum = sum + digits;
			num = num / 10;
		}

		System.out.println("The calculated number is: " + sum);
		sc.close();

	}

}
