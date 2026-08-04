package day32;

import java.util.Scanner;

public class CountVowelsConsonants_0408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();

		int upper = 0;
		int lower = 0;
		int digits = 0;
		int special = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				upper++;
			} else if (Character.isLowerCase(ch)) {
				lower++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else if (!Character.isWhitespace(ch)) {
				special++;
			}
		}

		System.out.println("Upper Case: " + upper);
		System.out.println("Lower Case: " + lower);
		System.out.println("Digits: " + digits);
		System.out.println("Special Characters: " + special);

	}

}
