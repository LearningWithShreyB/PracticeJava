package day31;

import java.util.Scanner;

public class CountSpecificDigit_0408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		System.out.println("Enter the target digit to search:");
		int targetDigit = sc.nextInt();

		int originalNum = num;
		int count = 0;

		num = Math.abs(num);

		while (num != 0) {
			int digit = num % 10;
			if (digit == targetDigit) {
				count++;
			}
			num = num / 10;
		}

		System.out.println("Digit " + targetDigit + " occurs " + count + " times in " + originalNum);
		sc.close();
	}

}
