package day02;

import java.util.Scanner;

public class VotingExamplePractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter age: ");
		int age = sc.nextInt();
	

		String result = (age >= 18) ? "Eligible" : "Not Eligible";
		System.out.println(result);
		sc.close();
	}

}
