package day10;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabetsArraySort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements:- ");
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
		}

		System.out.println("Elements before sorting: " + Arrays.toString(a));

		Arrays.sort(a);

		System.out.println("Elements after sorting: " + Arrays.toString(a));

		sc.close();
	}

}
