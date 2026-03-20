package day10;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallestNumberInArray {

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

		Arrays.sort(a);
		System.out.println("After sorting elements are: ");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("We got the smallest number which is: " + a[0]);

		System.out.println("We got the largest number which is: " + a[n - 1]);

		sc.close();

	}

}
