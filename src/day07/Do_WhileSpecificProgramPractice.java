package day07;

import java.util.Scanner;

public class Do_WhileSpecificProgramPractice {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		String username;
		String password;
		do
		{
			System.out.println("Enter the username: ");
			username=sc.next();
			System.out.println("Enter the password: ");
			password=sc.next();
			
			if(!username.equals("admin123")||!password.equals("admin"))
			{
				System.out.println("Wrong Credentials!! Please try again!!");
			}
		}while(!username.equals("admin123")||!password.equals("admin"));
		
		System.out.println("Logged in Sucessfully!");

	}

}
