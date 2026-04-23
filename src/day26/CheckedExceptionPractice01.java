package day26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionPractice01 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Program started");

		FileInputStream file = new FileInputStream(
				"D:\\Udemy\\Selenium with Java Course\\Notes\\Lectures\\File\\javafile.txt");
		//file.read();
		System.out.println("Program completed");
	}

}
