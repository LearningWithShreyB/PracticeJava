package day25;

import java.util.Scanner;

public class NullPointerException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program is started");

		String s = null;
		System.out.println("Length os a string is: " + s.length());

		System.out.println("Program is completed");
		sc.close();

	}

}
