package day04;

import java.util.Scanner;

public class WeekNumberPracticeUsingSwichCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter week name: ");
		String week_Name = sc.next();

		switch (week_Name.toUpperCase()) {
		case "SUNDAY":
			System.out.println("You have entered Sunday, Enjoy your day!!");
			break;
		case "MONDAY":
			System.out.println("You have entered Monday, Feeling Momday Blues!!");
			break;
		case "TUESDAY":
			System.out.println("You have entered Tuesday, Get set go for Transformation Tuesday!!");
			break;
		case "WEDNESDAY":
			System.out.println("You have entered Wednesday, attain Wisdom Wednesday!!");
			break;
		case "THURSDAY":
			System.out.println("You have entered Thursday, Ready for Throwback Thurday!!");
			break;
		case "FRIDAY":
			System.out.println("You have entered Friday, Its Finally Friday feeling!!");
			break;
		case "SATURDAY":
			System.out.println("You have entered Saturday, Its Saturday night");
			break;
		default:
			System.out.println("You have entered wrong week name!!");
		}

		sc.close();
	}

}
