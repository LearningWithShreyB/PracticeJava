package day33;

import java.util.Scanner;

public class WordInterchnage_0608 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter something!!");
		String str = sc.nextLine();

		String[] words = str.split(" ");

		System.out.println("Enter the first position: ");
		int pos1 = sc.nextInt();

		System.out.println("Enter the second position: ");
		int pos2 = sc.nextInt();

		pos1--;
		pos2--;

		if (pos1 >= 0 && pos1 < words.length && pos2 >= 0 && pos2 < words.length) {
			String temp = words[pos1];
			words[pos1] = words[pos2];
			words[pos2] = temp;

			System.out.println("After Swapping");

			for (String word : words) {
				System.out.print(word + " ");
			}
		} else {
			System.out.println("Invalid positions!!");
		}

		sc.close();

	}

}
