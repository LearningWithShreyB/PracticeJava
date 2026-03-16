package day08;

import java.util.Scanner;

public class SingleDimensionArrayPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements:- ");
		int[] a=new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The elements are: ");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}

		sc.close();

	}

}
