package day34;

public class Palindrome_0908 {

	public static void main(String[] args) {

		String str = "Hello";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}

		if (str.equals(rev)) {
			System.out.println("Its a Palindrome.");
		} else {
			System.out.println("Its not a Palindrome.");
		}
	}

}
