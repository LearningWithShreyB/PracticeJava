package day27;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice3 {

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

		int size = al1.size();
		System.out.println("The size of an ArrayList is: " + size);

		System.out.println("Give the index number from which we have to remove the element: ");
		int num = sc.nextInt();

		al1.remove(num);

		System.out.println("Printing data from ArrayList after removing the element: " + al1);

	}

}
