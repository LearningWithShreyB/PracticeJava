package day07;

import java.util.Scanner;

public class PrintingDescendingOrderPracticeUsingWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value: ");
		int sv = sc.nextInt();
		System.out.println("Enter the ending value: ");
		int ev = sc.nextInt();

		if (sv < ev) {
			System.out.println("Ending value should be less than starting value. Please do the needful!");
		} else {
			while (sv >= ev) {
				System.out.println(sv);
				sv--;
			}
		}
		sc.close();

	}

}
