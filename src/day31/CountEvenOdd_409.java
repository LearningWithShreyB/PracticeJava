package day31;

import java.util.Scanner;

public class CountEvenOdd_409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		int originalNum = num;
		int even = 0;
		int odd = 0;

		num = Math.abs(num);

		if (num == 0) {
			even = 1;
		} else {
			while (num != 0) {
				int digit = num % 10;
				if (digit % 2 == 0) {
					even++;
				} else {
					odd++;
				}
				num = num / 10;
			}
		}

		System.out.println("Number: " + originalNum);
		System.out.println("Even Digits: " + even);
		System.out.println("Odd Digits: " + odd);

	}

}
