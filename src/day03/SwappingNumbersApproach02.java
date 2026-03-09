package day03;

import java.util.Scanner;

public class SwappingNumbersApproach02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number for Swapping: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number for swapping: ");
		int b = sc.nextInt();
		System.out.println("Before Swapping, First Number is: " + a + "  and Second Number is: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping, First Number is: " + a + " and Second Number is: " + b);
		sc.close();

	}
}
