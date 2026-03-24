package day14;

import java.util.Scanner;

public class StringBufferMethodPractice01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = sc.nextLine();

		StringBuffer sb = new StringBuffer(a);
		
		System.out.println("The result is: " + sb.reverse());

		sc.close();

	}

}
