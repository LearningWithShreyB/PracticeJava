package day12;

import java.util.Scanner;

public class UpperCaseLowerCaseStringMethodPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = sc.nextLine();
		String upper_case_string = a.toUpperCase();
		System.out.println("The updated string when it changed to upper case is: " + upper_case_string);
		String lower_case_string = a.toLowerCase();
		System.out.println("The updated string when it changed to lower case is: " + lower_case_string);
		sc.close();

	}

}
