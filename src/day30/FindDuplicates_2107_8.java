package day30;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicates_2107_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Set<Integer> set = new LinkedHashSet<Integer>();

		System.out.println("Enter how many numbers:");
		int n = sc.nextInt();

		System.out.println("Enter the numbers:");
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			set.add(num);
		}

		System.out.println("The result is: ");
		for (int num : set) {
			System.out.println(num);
		}

		sc.close();
	}

}
