package day06;

import java.util.Scanner;

public class PrintingAscendingNumbersUsingForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value: ");
		int sv = sc.nextInt();
		System.out.println("Enter the ending value: ");
		int ev = sc.nextInt();
		for (int i = sv; i <= ev; i++) {
			System.out.println(i);
		}

		sc.close();
	}

}
