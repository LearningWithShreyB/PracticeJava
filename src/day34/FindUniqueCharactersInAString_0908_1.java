package day34;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueCharactersInAString_0908_1 {

	public static void main(String[] args) {

		String str = "Hello World";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey()+" ");
			}
		}
	}

}
