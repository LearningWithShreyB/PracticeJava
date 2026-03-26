package day16;

import java.util.Scanner;

public class CountOccurencesProgramPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String a = sc.nextLine();

		int[] count = new int[256];
		for (int i = 0; i < a.length(); i++) {
			count[a.charAt(i)]++;
		}

		System.out.println("Occurences of characters: ");
		for (int i = 0; i < 256; i++) {
			if (count[i] != 0) {
				System.out.println((char) i + " = " + count[i]);
			}
		}
		sc.close();

	}

}
