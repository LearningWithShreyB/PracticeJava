package day07;

import java.util.Scanner;

public class PrintingAscendingNumbersUsingDo_WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value: ");
		int sv = sc.nextInt();
		System.out.println("Enter the ending value: ");
		int ev = sc.nextInt();
		do {
			if (sv > ev) {
				System.out.println("Starting value should be less than ending value. Please do the needful!");
			} else {
				System.out.println(sv);
				sv++;
			}

		} while (sv <= ev);

		sc.close();
	}

}
