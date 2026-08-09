package day34;

public class CountNumberOfWordsInAString_0908 {

	public static void main(String[] args) {

		String str = "My name is SB";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ' && (i == 0 || str.charAt(i - 1) == ' ')) {
				count++;
			}
		}

		System.out.println("Number of Words: " + count);
	}

}
