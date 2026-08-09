package day34;

public class ReverseWordsInAString_0908 {

	public static void main(String[] args) {

		String str = "My name is SB";

		String[] words = str.split(" ");

		String result = "";

		for (int i = words.length - 1; i >= 0; i--) {
			result += words[i] + " ";
		}

		System.out.println("Original String is: " + str);
		System.out.println("Result is: " + result);
	}

}
