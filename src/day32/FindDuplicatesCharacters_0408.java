package day32;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicatesCharacters_0408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		Set<Character> seen = new HashSet<Character>();
		Set<Character> duplicate = new LinkedHashSet<Character>();

		for (char ch : str.toCharArray()) {
			if (!seen.add(ch)) {
				duplicate.add(ch);
			}
		}

		System.out.println("Duplicate Characters:");

		for (char ch : duplicate) {
			System.out.print(ch + " ");
		}

	}

}
