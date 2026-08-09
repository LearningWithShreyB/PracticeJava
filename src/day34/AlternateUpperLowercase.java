package day34;

public class AlternateUpperLowercase {

	public static void main(String[] args) {

		String str = "Shrey";

		String choice = "uppercase";

		System.out.println("Should the first character either be the lowercase or uppercase, we have chosen " + choice);

		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (choice.equalsIgnoreCase("uppercase")) {
				if (i % 2 == 0) {
					result += Character.toUpperCase(str.charAt(i));
				} else {
					result += Character.toLowerCase(str.charAt(i));
				}
			} else if (choice.equalsIgnoreCase("lowercase")) {
				if (i % 2 == 0) {
					result += Character.toLowerCase(str.charAt(i));
				} else {
					result += Character.toUpperCase(str.charAt(i));
				}
			} else {
				System.out.println("Invalid choice");
			}

		}

		System.out.println("Original String is: " + str);
		System.out.println("Result is: " + result);
	}

}
