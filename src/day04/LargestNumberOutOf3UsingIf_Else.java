package day04;

import java.util.Scanner;

public class LargestNumberOutOf3UsingIf_Else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Enter third number: ");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("First number i,e. " + a + " is largest number");
		} else if (b > c && b > c) {
			System.out.println("Second number i,e. " + b + " is largest number");
		} else {
			System.out.println("Third number i,e. " + c + " is largest number");
		}

		sc.close();
	}

}
