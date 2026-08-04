package day31;

import java.util.Scanner;

public class Reverse_0408_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");

		String s = sc.next();

		String rev = new StringBuilder(s).reverse().toString();

		System.out.println("The original string is: " + s);

		System.out.println("The reverse string is: " + rev);

		if (s.equals(rev)) {
			System.out.println("The string is palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}

		sc.close();

	}
}
