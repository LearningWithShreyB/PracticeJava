package day26;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionPractice02 {

	public static void main(String[] args) throws IOException {
		System.out.println("Program started");

		FileInputStream file = new FileInputStream(
				"D:\\Udemy\\Selenium with Java Course\\Notes\\Lectures\\File\\javafile.txt");
		System.out.println(file.read());
		System.out.println("Program completed");
	}

}
