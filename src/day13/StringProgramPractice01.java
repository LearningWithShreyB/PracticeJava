package day13;

import java.util.Scanner;

public class StringProgramPractice01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String a = sc.nextLine();

		System.out.println("Enter the first split character : ");
		String spc = sc.nextLine();

		System.out.println("Enter the second split character : ");
		String spc2 = sc.nextLine();

		String[] r1 = a.split(java.util.regex.Pattern.quote(spc));

		System.out.println("The final words are: ");

		for (int i = 0; i < r1.length; i++) {

			String part = r1[i].trim();

			if (part.contains(spc2)) {

				String[] r2 = part.split(java.util.regex.Pattern.quote(spc2));

				for (int j = 0; j < r2.length; j++) {
					System.out.println(r2[j].trim());
				}

			} else {
				System.out.println(part);
			}
		}

		sc.close();
	}
}