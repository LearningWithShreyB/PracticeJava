package day28;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetPractice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<Object> hs1 = new HashSet<Object>();

		hs1.add(150);
		hs1.add(22.7);
		hs1.add(true);
		hs1.add("Hello");
		hs1.add('S');
		hs1.add(150);
		hs1.add(null);
		hs1.add(null);

		System.out.println("Printing data from HashSet before removing the element: " + hs1);
		System.out.println("Enter element to remove:");
		String input = sc.next();

		if (input.equalsIgnoreCase("null")) {
			hs1.remove(null);
		} else if (input.matches("\\d+")) {
			hs1.remove(Integer.parseInt(input));
		} else if (input.matches("\\d+\\.\\d+")) {
			hs1.remove(Double.parseDouble(input));
		} else if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
			hs1.remove(Boolean.parseBoolean(input));
		} else if (input.length() == 1) {
			hs1.remove(input.charAt(0));
		} else {
			hs1.remove(input);
		}

		System.out.println("Printing data from HashSet after removing the element: " + hs1);

		sc.close();

	}

}
