package day28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Object> hs1 = new HashSet<Object>();
		System.out.println("Enter a number: ");
		int a1 = sc.nextInt();
		System.out.println("Enter a decimal: ");
		double a2 = sc.nextDouble();
		System.out.println("Enter a String: ");
		String a3 = sc.next();
		System.out.println("Enter a number: ");
		int a4 = sc.nextInt();
		System.out.println("Enter a boolean: ");
		boolean a5 = sc.nextBoolean();

		hs1.add(a1);
		hs1.add(a2);
		hs1.add(a3);
		hs1.add(a4);
		hs1.add(a5);
		hs1.add("ShreyB");
		hs1.add(null);
		hs1.add(null);

		System.out.println("Printing data from HashSet for first time: " + hs1);
		System.out.println("Printing data from HashSet for second time: " + hs1);

	}

}
