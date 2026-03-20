package day10;

import java.util.Scanner;

public class SearchingElementInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements:- ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the number which you want to search: ");
		int search_num = sc.nextInt();
		boolean result = false;

		for (int i = 0; i < n; i++) {
			if (search_num == a[i]) {
				result = true;
			}
		}

		if (result == true) {
			System.out.println("Element found!!");
		} else {
			System.out.println("Nope, not found!");
		}

		sc.close();

	}

}
