package day31;

import java.util.Scanner;

public class PrimeNumberPrinting_0408_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");

		int num = sc.nextInt();

		System.out.println("The prime numbers from 1 to " + num + "are: ");
		if (num <= 1) {
			System.out.println("Invalid Input");
		} else {
			for (int i = 2; i <= num; i++) {
				boolean isPrime = true;

				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.println(i + " ");
				}
			}

		}

		sc.close();

	}
}
