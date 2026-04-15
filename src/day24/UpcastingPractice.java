package day24;

import java.util.Scanner;

public class UpcastingPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an int type number: ");
		int num1 = sc.nextInt();
		long num2 = num1;
		System.out.println("The updated long type number is: " + num2);

		System.out.println("Enter a float type number: ");
		float num3 = sc.nextFloat();
		double num4 = num3;
		System.out.println("The updated double type number is: " + num4);

		System.out.println("Enter an int type number: ");
		int num5 = sc.nextInt();
		double num6 = num5;
		System.out.println("The updated double type number is: " + num6);

		System.out.println("Enter an int type number: ");
		int num7 = sc.nextInt();
		float num8 = num7;
		System.out.println("The updated float type number is: " + num8);
		
		sc.close();
	}

}
