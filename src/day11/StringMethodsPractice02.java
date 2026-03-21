package day11;

import java.util.Scanner;

public class StringMethodsPractice02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = sc.next();
		System.out.println("Enter a string: ");
		String s2 = sc.next();

		System.out.println("Is s1 and s2 equal? " + s1.equals(s2));
		sc.close();

	}

}
