package day31;

import java.util.Scanner;

public class PrimeNumberCheck_0408_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");

		int num = sc.nextInt();

		boolean isPrime = true;

		if (num <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println("The given number is prime.");
		} else {
			System.out.println("The given number is not a prime number.");
		}

		sc.close();

	}
}
