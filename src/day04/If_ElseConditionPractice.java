package day04;

import java.util.Scanner;

public class If_ElseConditionPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Congratulations!! You are eligible to vote.");
		} else {
			System.out.println(
					"Not an adult, huh!! You will be eligible shortly in couple years as soon as you turn 18!!");
		}
		sc.close();
	}
}
