package day18;

public class Main01 {

	public static void main(String[] args) {

		CallByValuePractice cv = new CallByValuePractice();
		int number = 100;
		System.out.println("The value of number before calling the method: " + number);
		cv.m1(number);
		System.out.println("The value of number after calling the method: " + number);

	}

}
