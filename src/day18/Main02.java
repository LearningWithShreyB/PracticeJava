package day18;

public class Main02 {

	public static void main(String[] args) {

		CallByReferencePractice cr = new CallByReferencePractice();
		cr.number = 100;
		System.out.println("The value of number before calling the method: " + cr.number);
		cr.m1(cr);
		System.out.println("The value of number after calling the method: " + cr.number);

	}

}
