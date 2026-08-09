package day34;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfCharactersInAString {

	public static void main(String[] args) {

		String str = "Hello World";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
