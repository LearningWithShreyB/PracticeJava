package day18;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {

		EncapsulationPractice en = new EncapsulationPractice();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = sc.nextLine();
		en.setA(a);
		System.out.println("The value is: ");
		System.out.println(en.getA());
		sc.close();

	}

}
