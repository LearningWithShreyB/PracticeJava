package day08;

import java.util.Scanner;

public class PalindromeNumberPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int onum = sc.nextInt();
		System.out.println("The original number is: " + onum);
		
		int num=onum;

		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + (num % 10);
			num = num / 10;
		}
		System.out.println("The obtained number is: " + rev);

		if (rev == onum) {
			System.out.println("The given number is palindrome number.");
		} else {
			System.out.println("The given number is not a palindrome number.");
		}

		sc.close();

	}

}
