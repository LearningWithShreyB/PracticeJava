package day30;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharacters_2107_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = sc.next();

		Set<Character> set = new LinkedHashSet<Character>();

		for (char ch : str.toCharArray()) {
			set.add(ch);
		}

		System.out.println("The result is: ");
		for (char ch : set) {
			System.out.println(ch);
		}

		sc.close();
	}

}
