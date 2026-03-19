package day09;

import java.util.Scanner;

public class TwoDimensionalArrayPracticeByUserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int r = sc.nextInt();
		System.out.println("Enter no. of columns: ");
		int c = sc.nextInt();

		int[][] a = new int[r][c];

		for (int i = 0; i <= r - 1; i++) {
			for (int j = 0; j <= c - 1; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i <= r - 1; i++) {
			for (int j = 0; j <= c - 1; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}

		sc.close();

	}

}
