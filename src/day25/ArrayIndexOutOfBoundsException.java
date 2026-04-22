package day25;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Program is started");

		int[] a = new int[5];
		System.out.println("ENter a position: ");
		int pos = sc.nextInt();
		System.out.println("Enter a number: ");
		a[pos] = sc.nextInt();
		int num = a[pos];
		System.out.println("Result is: " + num);

		System.out.println("Program is completed");

		sc.close();

	}

}
