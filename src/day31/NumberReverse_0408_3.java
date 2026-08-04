package day31;

import java.util.Scanner;

public class NumberReverse_0408_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");

		int originalnum = sc.nextInt();
		
		int num=originalnum;

		int rev = 0;
		
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}

		System.out.println("The original number is: " + originalnum);

		System.out.println("The reverse number is: " + rev);

		if (originalnum==rev) {
			System.out.println("The given number is palindrome.");
		} else {
			System.out.println("The given number is not a palindrome.");
		}

		sc.close();

	}
}
