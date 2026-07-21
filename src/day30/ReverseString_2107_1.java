package day30;

import java.util.Scanner;

public class ReverseString_2107_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = sc.next();
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}

		System.out.println("The reverse string is: " + rev);

		sc.close();
	}

}
