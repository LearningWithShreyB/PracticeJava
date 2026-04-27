package day29;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

		System.out.println("Enter the firstkey pair: ");
		int p1 = sc.nextInt();
		System.out.println("Enter the first value pair: ");
		String p2 = sc.next();
		hm1.put(p1, p2);

		System.out.println("Enter the second key pair: ");
		int p3 = sc.nextInt();
		System.out.println("Enter the second value pair: ");
		String p4 = sc.next();
		hm1.put(p3, p4);

		System.out.println("Enter the third key pair: ");
		int p5 = sc.nextInt();
		System.out.println("Enter the third value pair: ");
		String p6 = sc.next();
		hm1.put(p5, p6);

		System.out.println("Enter the fourth key pair: ");
		int p7 = sc.nextInt();
		System.out.println("Enter the fourth value pair: ");
		String p8 = sc.next();
		hm1.put(p7, p8);

		System.out.println("Enter the fifth key pair: ");
		int p9 = sc.nextInt();
		System.out.println("Enter the fifth value pair: ");
		String p10 = sc.next();
		hm1.put(p9, p10);

		System.out.println("Printing the value from HashMap: " + hm1);
		
		sc.close();

	}

}
