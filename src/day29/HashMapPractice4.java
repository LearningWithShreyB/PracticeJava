package day29;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Object, Object> hm2 = new HashMap<Object, Object>();

		hm2.put("Name", "Shrey");
		hm2.put("Initials", "SB");
		hm2.put("Age", 27);
		hm2.put("DOB", 26.04);
		hm2.put("Graduated", true);
		hm2.put("Married", null);

		System.out.println("Printing the value from HashMap: "+hm2);

		System.out.println("Enter the key pair from the existing elements: ");
		String k1 = sc.next();

		System.out.println("The result is: " + hm2.get(k1));

		sc.close();

	}

}
