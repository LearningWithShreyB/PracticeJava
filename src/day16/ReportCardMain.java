package day16;

import java.util.Scanner;

public class ReportCardMain {

	public static void main(String[] args) {

		ReportCardPractice rcp = new ReportCardPractice();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student ID: ");
		rcp.sid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the student name: ");
		rcp.sname = sc.nextLine();

		System.out.println("The details are: ");
		rcp.result();

		sc.close();

	}

}
