package day34;

public class InterchangeThePositionOfCharactersInAString_IndexAs0_0908 {

	public static void main(String[] args) {

		String str = "Hello";

		char[] ch = str.toCharArray();

		int pos1 = 1;
		int pos2 = 5;
		
		pos1--;
		pos2--;

		if (pos1 < 0 || pos1 >= ch.length || pos2 < 0 || pos2 >= ch.length) {
			System.out.println("Invalid Position!!");
		} else {
			char temp = ch[pos1];
			ch[pos1] = ch[pos2];
			ch[pos2] = temp;

			String result = new String(ch);

			System.out.println("Original String is: " + str);
			System.out.println("Result is: " + result);
		}

	}

}
