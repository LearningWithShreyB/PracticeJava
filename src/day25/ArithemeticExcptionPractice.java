package day25;

import java.util.Scanner;

public class ArithemeticExcptionPractice {

	public static void main(String[] args) {

		System.out.println("Program is started");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();

		System.out.println("Result is: " + (100 / num));

		System.out.println("Program is completed");

		sc.close();

	}

}
