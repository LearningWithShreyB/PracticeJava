package day14;

import java.util.Scanner;

public class ReverseAStringPractice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String a = sc.nextLine();
		String rev = "";

		char[] ch = a.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i] + " ";
		}

		System.out.println("The result is: " + rev);

	}

}
