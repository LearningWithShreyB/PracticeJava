package day27;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice6 {

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

		System.out.println("Printing data from ArrayList " + al1);

		System.out.println("Give the index number, we have to get the element from: ");
		int num = sc.nextInt();

		Object a1 = al1.get(num);

		System.out.println("Printing element which we get from index "+num+": " + a1);

		sc.close();

	}

}
