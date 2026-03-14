package day07;

import java.util.Scanner;

public class PrintingEvenOddNumberPracticeUsingForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int sv = sc.nextInt();
		System.out.println("Enter ending number: ");
		int ev = sc.nextInt();

		String even = "";
		String odd = "";

		for (int i = sv; i <= ev; i++) {
			if (i % 2 == 0) {
				even = even + i + " ";
			} else {
				odd = odd + i + " ";
			}
		}

		System.out.println("Set of even numbers: " + even);
		System.out.println("Set of odd numbers: " + odd);

		sc.close();
	}

}
