package day10;

import java.util.Scanner;

public class DuplicateElementInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements:- ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter any number: ");
		int value = sc.nextInt();
		int count = 0;

		for (int num : a) {
			if (value == num) {
				count++;
			}
		}

		System.out.println("No. of duplicates found: " + count);

		sc.close();

	}

}
