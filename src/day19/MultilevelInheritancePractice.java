package day19;

import java.util.Scanner;

public class MultilevelInheritancePractice {

	public static void main(String[] args) {

		E obj2 = new E();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		obj2.c = sc.nextInt();
		System.out.println("Enter a number: ");
		obj2.d = sc.nextInt();
		System.out.println("Enter a number: ");
		obj2.e = sc.nextInt();

		obj2.show3();
		obj2.show4();
		obj2.show5();

		sc.close();

	}

}
