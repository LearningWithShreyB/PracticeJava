package day12;

import java.util.Scanner;

public class replaceStringMethodPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = sc.nextLine();
		System.out.println("Enter a character or string you want to replace: ");
		String r1 = sc.nextLine();
		System.out.println("Enter a character or string you want to replace with: ");
		String r2 = sc.nextLine();
		String final_string = a.replace(r1, r2);
		System.out.println("The updated string is: " + final_string);

		sc.close();
	}

}
