package day10;

import java.util.Scanner;

public class PrintEvenAndOddNumbersInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements:- ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("Even digits are: " + a[i]);
			} else {
				System.out.println("Odd digits are: " + a[i]);
			}
		}

	}

}
