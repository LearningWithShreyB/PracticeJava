package day22;

import java.util.Scanner;

public class Wrapper_UnBoxing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer oject variable: ");
		Integer i = sc.nextInt();
		System.out.println("Enter a float object variable: ");
		Float f = sc.nextFloat();
		System.out.println("Enter a double object variable: ");
		Double d = sc.nextDouble();
		System.out.println("Enter a character object variable: ");
		Character c = sc.next().charAt(0);
		System.out.println("Enter a boolean object variable: ");
		Boolean b = sc.nextBoolean();

		int iobj = i;
		float fobj = f;
		double dobj = d;
		char cobj = c;
		boolean bobj = b;

		System.out.println("The value of integer is: " + iobj);
		System.out.println("The value of float is: " + fobj);
		System.out.println("The value of double is: " + dobj);
		System.out.println("The value of character is: " + cobj);
		System.out.println("The value of boolean is: " + bobj);

		sc.close();

	}

}
