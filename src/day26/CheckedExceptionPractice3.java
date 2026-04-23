package day26;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionPractice3 {

	public static void main(String[] args) {
		System.out.println("Program started");
		try {
			FileInputStream file = new FileInputStream(
					"D:\\Udemy\\Selenium with Java Course\\Notes\\Lectures\\File\\javafile.txt");
			System.out.println(file.read());
		} catch (Exception e) {
			System.out.println("Exception handled");
			e.setStackTrace(null);
		}
		System.out.println("Program completed");
	}

}
