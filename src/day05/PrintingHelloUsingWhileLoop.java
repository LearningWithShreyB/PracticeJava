package day05;

import java.util.Scanner;

public class PrintingHelloUsingWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value till you want to print Hello: ");
		int ev = sc.nextInt();
		int i = 1;
		while (i <= ev) {
			System.out.println("Hello");
			i++;
		}

		sc.close();
	}

}
