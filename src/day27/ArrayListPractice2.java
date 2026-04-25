package day27;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Object> al1 = new ArrayList<Object>();
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

		al1.add(a1);
		al1.add(a2);
		al1.add(a3);
		al1.add(a4);
		al1.add(a5);
		al1.add("ShreyB");
		al1.add(null);
		al1.add(null);

		System.out.println("Printing data from ArrayList: " + al1);

		int size = al1.size();
		System.out.println("The size of an ArrayList is: " + size);

	}

}
