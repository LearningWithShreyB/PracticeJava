package day04;

import java.util.Scanner;

public class EvenorOddProgramPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number of your choice: ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Ohh, geez, you have entered an even number.");
		} else {
			System.out.println("Ohh, geez, you have entered an odd number.");
		}
		sc.close();

	}
}
