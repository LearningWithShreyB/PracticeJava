package day14;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String a = sc.nextLine();

		String rev = "";
		System.out.println("The second result output: ");
		for (int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i)+" ";
		}

		System.out.println(rev);

		sc.close();

	}

}
