package day13;

import java.util.Scanner;

public class StringIntegerCombinedProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = sc.nextLine();
		System.out.println("Enter the replace character from the existing string: ");
		String r1 = sc.nextLine();
		String final_string = a.replace(r1, "");
		System.out.println("The final updated string is: " + final_string);

		int num1 = Integer.parseInt(final_string);
		System.out.println("Enter another number: ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("The sum of numbers are: " + sum);

		sc.close();

	}

}
