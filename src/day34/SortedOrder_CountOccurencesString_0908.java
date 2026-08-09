package day34;

import java.util.LinkedHashMap;
import java.util.Map;

public class SortedOrder_CountOccurencesString_0908 {

	public static void main(String[] args) {

		String str = "Hello World";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

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
