package day31;

import java.util.Scanner;

public class Reverse_0408_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");

		String s = sc.next();

		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}

		System.out.println("The original string is: " + s);

		System.out.println("The reverse string is: " + rev);

		if (s.equals(rev)) {
			System.out.println("The string is palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}

		sc.close();

	}
}
