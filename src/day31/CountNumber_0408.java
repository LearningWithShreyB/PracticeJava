package day31;

import java.util.Scanner;

public class CountNumber_0408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		int originalNum = num;
		int count = 0;

		if (num == 0) {
			count = 0;
		} else {
			while (num != 0) {
				count++;
				num = num / 10;
			}
		}

		System.out.println("The number of digits in " + originalNum + " is: " + count);

	}

}
