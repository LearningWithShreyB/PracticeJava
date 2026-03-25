package day15;

import java.util.Scanner;

public class CountCharactersInAStringProgramPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String a = sc.nextLine();
		int count = 0;

		for (int i = 0; i < a.length(); i++) {
			a.charAt(i);
			count++;
		}

		System.out.println("No of characters in a string is: " + count);

		sc.close();

	}

}
