package day27;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Object> al1 = new ArrayList<Object>();

		al1.add(150);
		al1.add(22.7);
		al1.add(true);
		al1.add("Hello");
		al1.add('S');
		al1.add(150);
		al1.add(null);
		al1.add(null);

		System.out.println("Printing data from ArrayList before inserting the element: " + al1);

		System.out.println("Give the index number from which we have to insert the element: ");
		int num = sc.nextInt();
		
		System.out.println("Enter a value: ");
		String value = sc.next();

		al1.add(num, value);

		System.out.println("Printing data from ArrayList after inserting the element: " + al1);

	}

}
