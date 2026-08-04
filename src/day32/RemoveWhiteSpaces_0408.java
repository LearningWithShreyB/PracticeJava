package day32;

import java.util.Scanner;

public class RemoveWhiteSpaces_0408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(!Character.isWhitespace(ch)) {
				result.append(ch);
			}
		}
		
		System.out.println("After removing spaces: " + result);
		
		
		sc.close();

	}

}
