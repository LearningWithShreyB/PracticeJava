package day30;

import java.util.HashMap;
import java.util.Scanner;

public class CountFrequencyOfCharacters_2107_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = sc.next();

		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		System.out.println("The result is: " + map);

		sc.close();
	}

}
