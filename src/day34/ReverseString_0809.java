package day34;

public class ReverseString_0809 {

	public static void main(String[] args) {
		String str = "Hello";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}

		System.out.println("The result is: " + rev);

	}

}
