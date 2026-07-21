package day30;

import java.util.Scanner;

public class ReverseString_2107_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = sc.next();
		char[] arr = str.toCharArray();

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}

		System.out.println("The reverse string is: " + new String(arr));

		sc.close();
	}

}
