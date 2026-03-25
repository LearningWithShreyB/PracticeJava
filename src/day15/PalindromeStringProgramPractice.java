package day15;

import java.util.Scanner;

public class PalindromeStringProgramPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = sc.nextLine();

		String original_string = a;
		String rev = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		System.out.println("The reverse string is: " + rev);

		if (rev.equals(original_string)) {
			System.out.println("The given string is palindrome");
		} else {
			System.out.println("Nope! Not a palindrome string");
		}

		sc.close();
	}

}
