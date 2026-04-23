package day26;

import java.util.Scanner;

public class HandleNullPointerException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program is started");
		try {
			String s = null;
			System.out.println("Length os a string is: " + s.length());
		} catch (Exception e) {
			System.out.println("Exception handled");
			System.out.println(e.getMessage());
		}

		System.out.println("Program is completed");
		sc.close();

	}

}
