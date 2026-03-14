package day07;

import java.util.Scanner;

public class PrintingHelloUsingDo_WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value till you want to print Hello: ");
		int ev = sc.nextInt();
		int i = 1;
		do {
			System.out.println("Hello");
			i++;
		} while (i <= ev);

		sc.close();
	}

}
