package day08;

import java.util.Scanner;

public class DigitsCountPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("The original number is: " + num);
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}

		System.out.println("The digit count: " + count);
		sc.close();

	}

}
