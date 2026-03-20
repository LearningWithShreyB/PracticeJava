package day10;

import java.util.Scanner;

public class DuplicateElementInArray02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n = sc.nextInt();

		System.out.println("Enter " + n + " elements:- ");
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Duplicate elements are: ");

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;

			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					isDuplicate = true;
					break;
				}
			}

			// To avoid printing same duplicate multiple times
			if (isDuplicate) {
				boolean alreadyPrinted = false;

				for (int k = 0; k < i; k++) {
					if (a[k] == a[i]) {
						alreadyPrinted = true;
						break;
					}
				}

				if (!alreadyPrinted) {
					System.out.println(a[i]);
				}
			}
		}

		sc.close();
	}
}