package day10;

import java.util.Arrays;
import java.util.Scanner;

public class MissingElementinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements:- ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Elements are: ");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		int actualSum = 0;

		for (int i = 0; i < a.length; i++) {
			actualSum = actualSum + a[i];
		}

		System.out.println("Actual Sum of elements: " + actualSum);

		int expectedSum = (n + 1) * (n + 2) / 2;

		int missingNumber = expectedSum - actualSum;

		System.out.println("Missing number is: " + missingNumber);

		sc.close();
	}

}
