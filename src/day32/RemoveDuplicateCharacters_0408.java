package day32;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharacters_0408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		Set<Character> set = new LinkedHashSet<>();
		for (char ch : str.toCharArray()) {
			set.add(ch);
		}
		System.out.println("The result is: ");

		for (char ch : set) {
			System.out.print(ch+" ");
		}

		sc.close();

	}

}
