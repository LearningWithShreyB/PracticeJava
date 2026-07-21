package day30;

import java.util.Scanner;

public class Palindrome_2107_4 {

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

		if (str.equals(new String(arr))) {
			System.out.println("The given string is palindrome!!");
		} else {
			System.out.println("Nope, not a paindrome!!");
		}

		sc.close();
	}

}
