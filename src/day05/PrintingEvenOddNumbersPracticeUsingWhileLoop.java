package day05;

import java.util.Scanner;

public class PrintingEvenOddNumbersPracticeUsingWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value: ");
		int sv = sc.nextInt();
		System.out.println("Enter the ending value: ");
		int ev = sc.nextInt();

		String even = "";
		String odd = "";

		while (sv <= ev) {
			if (sv % 2 == 0) {
				even = even + sv + " ";
			} else {
				odd = odd + sv + " ";
			}
			sv++;
		}

		System.out.println("Set of even numbers: " + even);
		System.out.println("Set of odd numbers: " + odd);

		sc.close();

	}

}
