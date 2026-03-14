package day07;

import java.util.Scanner;

public class PrintingEvenNumbersPracticeUsingDo_WhileLoop {

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
				if (sv % 2 == 0) {
					System.out.println(sv);
				}
				sv++;
			}

		} while (sv <= ev);
		sc.close();

	}

}
