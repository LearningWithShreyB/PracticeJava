package day29;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, Object> hm2 = new HashMap<>();

		hm2.put("Name", "Shrey");
		hm2.put("Initials", "SB");
		hm2.put("Age", 27);
		hm2.put("DOB", 26.04);
		hm2.put("Graduated", true);
		hm2.put("Married", null);

		System.out.println("Printing data from HashMap before removing the element: " + hm2);
		System.out.println("Whether the list is empty or not still?: " + hm2.isEmpty());

		hm2.clear();

		System.out.println("After givimng clear command, whether the list is empty or not still?: " + hm2.isEmpty());

		System.out.println("Printing data from ArrayList after removing the element: " + hm2);

		sc.close();

	}

}
