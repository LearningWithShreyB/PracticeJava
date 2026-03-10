package day04;

import java.util.Scanner;

public class NumberNatureUsingIf_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number of your choice: ");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Ohh, a positive number.");
		} else if (num < 0) {
			System.out.println("Ohh, a negative number.");
		} else {
			System.out.println("Hey, you have entered zero.");
		}
		sc.close();

	}

}
