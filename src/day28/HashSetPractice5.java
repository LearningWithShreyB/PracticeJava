package day28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetPractice5 {

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

		System.out.println("Printing data from ArrayList: ");

		Iterator<Object> it = hs1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		sc.close();

	}

}
