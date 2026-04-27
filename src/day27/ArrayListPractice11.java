package day27;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice11 {

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

		System.out.println("Printing data from ArrayList before removing the element: " + al1);
		System.out.println("Whether the list is empty or not still?: " + al1.isEmpty());

		ArrayList<Object> al2 = new ArrayList<Object>();
		al2.add(150);
		al2.add(null);

		al1.removeAll(al2);

		System.out.println("Printing data from ArrayList after removing some elements: " + al1);
		System.out.println("Whether the list is empty or not still?: " + al1.isEmpty());

		al1.clear();

		System.out.println("After giving clear command, whether the list is empty or not still?: " + al1.isEmpty());

		System.out.println("Printing data from ArrayList after removing the element: " + al1);

		sc.close();

	}

}
