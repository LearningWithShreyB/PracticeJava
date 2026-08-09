package day34;

public class ReverseEachWordInAString_0908 {

	public static void main(String[] args) {

		String str = "Hello";
		String[] words = str.split(" ");

		String result = "";

		for (String word : words) {

			String rev = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				rev += word.charAt(i);
			}

			result += rev + " ";
		}

		System.out.println("Original String is: " + str);
		System.out.println("Result is: " + result);
	}

}
