package day27;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice7 {

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

		System.out.println("Printing data from ArrayList: ");

		for (int i = 0; i < al1.size(); i++) {
			System.out.println(al1.get(i));
		}

		sc.close();

	}

}
