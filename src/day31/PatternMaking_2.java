package day31;

public class PatternMaking_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The result is: ");
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
