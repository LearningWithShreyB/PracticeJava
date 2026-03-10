package day04;

import java.util.Scanner;

public class WeekNamePracticeUsingSwichCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter week day number: ");
		int week_number = sc.nextInt();

		switch (week_number) {
		case 1:
			System.out.println("You have entered Sunday, Enjoy your day!!");
			break;
		case 2:
			System.out.println("You have entered Monday, Feeling Momday Blues!!");
			break;
		case 3:
			System.out.println("You have entered Tuesday, Get set go for Transformation Tuesday!!");
			break;
		case 4:
			System.out.println("You have entered Wednesday, attain Wisdom Wednesday!!");
			break;
		case 5:
			System.out.println("You have entered Thursday, Ready for Throwback Thurday!!");
			break;
		case 6:
			System.out.println("You have entered Friday, Its Finally Friday feeling!!");
			break;
		case 7:
			System.out.println("You have entered Saturday, Its Saturday night");
			break;
		default:
			System.out.println("You have entered wrong week number!!");
		}

		sc.close();

	}

}
