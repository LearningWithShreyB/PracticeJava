package day13;

import java.util.Scanner;

public class Replace_StringMethodPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = sc.nextLine();
		System.out.println("Enter the first replace character from the existing string: ");
		String r1 = sc.nextLine();
		System.out.println("Enter the second replace character from the existing string: ");
		String r2 = sc.nextLine();
		String final_string = a.replace(r1, "").replace(r2, "");
		System.out.println("The final updated string is: " + final_string);

		sc.close();

	}

}
