package day16;

import java.util.Scanner;

public class CountOccurencesOfParticularCharacterProgramPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String a = sc.nextLine();

		System.out.println("Enter a character you want to find occurences: ");
		char ch = sc.nextLine().charAt(0);

		int count = 0;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ch) {
				count++;
			}
		}

		System.out.println("Occurences of " + ch + " in the specified string: " + count);
		sc.close();

	}

}
