package day08;

import java.util.Scanner;

public class EvenAndOddDigitsCountPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int even = 0;
		int odd = 0;
		while (num > 0) {
			int digit = num % 10;
			if (digit % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			num = num / 10;
		}

		System.out.println("The even digits count are : " + even);
		System.out.println("The odd digits count are : " + odd);
		sc.close();

	}

}
