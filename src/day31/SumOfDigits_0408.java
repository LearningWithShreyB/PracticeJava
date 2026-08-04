package day31;

import java.util.Scanner;

public class SumOfDigits_0408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		int originalNum = num;
		int sum = 0;

		num = Math.abs(num);

		if (num == 0) {
			sum = 0;
		} else {
			while (num != 0) {
				int digit = num % 10;
				sum = sum + digit;
				num = num / 10;
			}
		}

		System.out.println("The sum of digits in " + originalNum + " is: " + sum);

	}

}
