package day22;

import java.util.Scanner;

public class Wrapper_AutoBoxing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer variable: ");
		int i = sc.nextInt();
		System.out.println("Enter a float variable: ");
		float f = sc.nextFloat();
		System.out.println("Enter a double variable: ");
		double d = sc.nextDouble();
		System.out.println("Enter a character variable: ");
		char c = sc.next().charAt(0);
		System.out.println("Enter a boolean variable: ");
		boolean b = sc.nextBoolean();

		Integer iobj = i;
		Float fobj = f;
		Double dobj = d;
		Character cobj = c;
		Boolean bobj = b;

		System.out.println("The value of object integer is: " + iobj);
		System.out.println("The value of object float is: " + fobj);
		System.out.println("The value of object double is: " + dobj);
		System.out.println("The value of object character is: " + cobj);
		System.out.println("The value of object boolean is: " + bobj);

		sc.close();

	}

}
