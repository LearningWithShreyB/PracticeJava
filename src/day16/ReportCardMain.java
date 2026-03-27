package day16;

import java.util.Scanner;

public class ReportCardMain {

	public static void main(String[] args) {

		ReportCardPractice rcp = new ReportCardPractice();
		Scanner sc = new Scanner(System.in);
		rcp.sid = sc.nextInt();
		rcp.sname = sc.nextLine();

		rcp.result();

		sc.close();

	}

}
