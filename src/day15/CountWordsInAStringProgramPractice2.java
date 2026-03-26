package day15;

import java.util.Scanner;

public class CountWordsInAStringProgramPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String a = sc.nextLine();
		int count = 0;

		for (int i = 0; i < a.length()-1; i++) {
			if (a.charAt(i) != ' ' && (i == 0 || a.charAt(i - 1) == ' ')) {
				count++;
			}
		}

		System.out.println("No of words in a string is: " + count);

		sc.close();

	}

}
