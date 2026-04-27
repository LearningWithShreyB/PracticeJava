package day27;

import java.util.HashSet;
import java.util.Scanner;

public class ArrayListPractice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<Object> hs1 = new HashSet<Object>();

		hs1.add(150);
		hs1.add(22.7);
		hs1.add(true);
		hs1.add("Hello");
		hs1.add('S');
		hs1.add(150);
		hs1.add(null);
		hs1.add(null);

		System.out.println("Printing data from HashSet before removing the element: " + hs1);


		hs1.remove(true);

		System.out.println("Printing data from HashSet after removing the element: " + hs1);

		sc.close();

	}

}
