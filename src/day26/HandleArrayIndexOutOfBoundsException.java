package day26;

import java.util.Scanner;

public class HandleArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Program is started");

		int[] a = new int[5];
		System.out.println("ENter a position: ");
		int pos = sc.nextInt();
		System.out.println("Enter a number: ");
		try {
			a[pos] = sc.nextInt();
			int num = a[pos];
			System.out.println("Result is: " + num);
		} catch (ArithmeticException e) {
			System.out.println("Exception handled");
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled");
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Exception handled");
			System.out.println(e.getMessage());
		}
		System.out.println("Program is completed");

		sc.close();

	}

}
