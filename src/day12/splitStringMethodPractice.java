package day12;

import java.util.Scanner;

public class splitStringMethodPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = sc.nextLine();
		System.out.println("Enter a spliting character given in the string: ");
		String spc = sc.nextLine();
		String[] result = a.split(spc);

		System.out.println("The final strings obtained are: ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
