package day06;

import java.util.Scanner;

public class PrintingHelloUsingForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value till you want to print Hello: ");
		int ev = sc.nextInt();
		for(int i=1;i<=ev;i++)
		{
			System.out.println("Hello");
		}
		sc.close();
	}

}
