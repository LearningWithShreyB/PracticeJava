package day29;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, Object> hm2 = new HashMap<>();

		/*hm2.put("Name", "Shrey");
		hm2.put("Initials", "SB");
		hm2.put("Age", 27);
		hm2.put("DOB", 26.04);
		hm2.put("Graduated", true);
		hm2.put("Married", null);*/

		if (hm2.isEmpty()) {
			System.out.println("HashMap is already empty. Nothing to remove.");
		} else {
			while (!hm2.isEmpty()) {

				System.out.println("Current HashMap: " + hm2);

				System.out.print("Enter key to remove: ");
				String key = sc.next();

				hm2.remove(key);

				if (hm2.isEmpty()) {
					System.out.println("All values deleted by you. Program terminated.");
					break;
				}

				System.out.print("Do you want to remove more? (yes/no): ");
				String choice = sc.next();

				if (choice.equalsIgnoreCase("no")) {
					System.out.println("Final HashMap after removing: " + hm2);
					break;
				}
			}
		}

		sc.close();
	}
}