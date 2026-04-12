package day23;

import java.util.Scanner;

public class DataTypeConversionPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer value: ");
		String intvalue = sc.nextLine();
		System.out.println("Please enter a double value: ");
		String doublevalue = sc.nextLine();
		System.out.println("Please enter a float value: ");
		String floatvalue = sc.nextLine();
		System.out.println("Please enter a character value: ");
		String charvalue = sc.nextLine();

		int i = Integer.parseInt(intvalue);
		System.out.println("The updated value after conversion into integer: " + i);
		double d = Double.parseDouble(doublevalue);
		System.out.println("The updated value after conversion into double: " + d);
		float f = Float.parseFloat(floatvalue);
		System.out.println("The updated value after conversion into double: " + f);
		char c = charvalue.charAt(0);
		System.out.println("The updated value after conversion into character through String function: " + c);

		sc.close();

	}

}
