package day24;

import java.util.Scanner;

public class DowncastingPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a long type number: ");
		long num1 = sc.nextLong();
		int num2 = (int) num1;
		System.out.println("The updated int type number is: " + num2);

		System.out.println("Enter a double type number: ");
		double num3 = sc.nextDouble();
		float num4 = (float) num3;
		System.out.println("The updated float type number is: " + num4);

		System.out.println("Enter a double type number: ");
		double num5 = sc.nextDouble();
		int num6 = (int) num5;
		System.out.println("The updated double type number is: " + num6);

		System.out.println("Enter a float type number: ");
		float num7 = sc.nextFloat();
		int num8 = (int) num7;
		System.out.println("The updated int type number is: " + num8);
		
		sc.close();
	}

}
