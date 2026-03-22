package day12;

import java.util.Scanner;

public class substringStringMethodPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = sc.nextLine();
		System.out.println("Enter the starting index: ");
		int si = sc.nextInt();
		System.out.println("Enter the ending index: ");
		int ei = sc.nextInt();
		String final_String = a.substring(si, ei);
		System.out.println("The substring of given string is: " + final_String);

		sc.close();

	}

}
