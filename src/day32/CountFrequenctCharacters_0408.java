package day32;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequenctCharacters_0408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}
		}

		System.out.println("Character Frequency:");

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}

		sc.close();

	}

}
