package day15;

import java.util.Scanner;

public class StringComparisonPractice {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("The first scenario of comparison: ");
		System.out.println();
		String a1 = "hello";
		System.out.println("The first string: "+a1);
		String a2 = "hello";
		System.out.println("The second string: "+a2);
		System.out.println("Using the == operator method: " + (a1 == a2));
		System.out.println("Using the equals() method: " + a1.equals(a2));
		System.out.println("Using the equalsIgnoreCase() method: " + a1.equalsIgnoreCase(a2));
		System.out.println();
		
		System.out.println("The second scenario of comparison: ");
		System.out.println();
		System.out.println("The first string: ");
		String a3 = sc.nextLine();
		System.out.println("The second string: ");
		String a4 = new String(sc.nextLine());
		System.out.println("Using the == operator method: " + (a3 == a4));
		System.out.println("Using the equals() method: " + a3.equals(a4));
		System.out.println("Using the equalsIgnoreCase() method: " + a3.equalsIgnoreCase(a4));
		System.out.println();
		
		System.out.println("The third scenario of comparison: ");
		System.out.println();
		System.out.println("The first string: ");
		String a5 = new String(sc.nextLine());
		System.out.println("The second string: ");
		String a6 = new String(sc.nextLine());
		System.out.println("Using the == operator method: " + (a5 == a6));
		System.out.println("Using the equals() method: " + a5.equals(a6));
		System.out.println("Using the equalsIgnoreCase() method: " + a5.equalsIgnoreCase(a6));

	}

}
