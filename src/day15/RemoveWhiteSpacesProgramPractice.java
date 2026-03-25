package day15;

import java.util.Scanner;

public class RemoveWhiteSpacesProgramPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String a = sc.nextLine();

		a = a.replaceAll("\\s", "");
		System.out.println("The updated string is: " + a);

		sc.close();
	}

}
