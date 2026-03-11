package day05;

import java.util.Scanner;

public class PrintingEvenNumbersPracticeUsingWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value: ");
		int sv = sc.nextInt();
		System.out.println("Enter the ending value: ");
		int ev = sc.nextInt();

		while (sv <= ev) {
			if (sv % 2 == 0) {
				System.out.println(sv);
			}
			sv++;
		}

		sc.close();

	}

}
