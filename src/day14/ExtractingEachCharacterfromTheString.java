package day14;

import java.util.Scanner;

public class ExtractingEachCharacterfromTheString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String a = sc.nextLine();

		System.out.println("The result: ");
		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}

		sc.close();

	}

}
