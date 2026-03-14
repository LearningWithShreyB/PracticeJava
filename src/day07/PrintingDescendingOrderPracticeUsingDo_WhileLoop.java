package day07;

import java.util.Scanner;

public class PrintingDescendingOrderPracticeUsingDo_WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value: ");
		int sv = sc.nextInt();
		System.out.println("Enter the ending value: ");
		int ev = sc.nextInt();
		
		if (sv < ev) {
			System.out.println("Ending value should be less than starting value. Please do the needful!");
		} else {
			do
			{
				System.out.println(sv);
				sv--;
			}while(sv>=ev);
		}

		sc.close();

	}

}
