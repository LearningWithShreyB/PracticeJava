package day32;

import java.util.Scanner;

public class RemoveSpecialCharacters_0409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(Character.isLetterOrDigit(ch)) {
				result.append(ch);
			}
		}
		
		System.out.println("After removing : " + result);
		
		
		sc.close();

	}

}
