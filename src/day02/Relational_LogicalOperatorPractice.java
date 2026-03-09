package day02;

public class Relational_LogicalOperatorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		a = 20;
		b = 10;

		boolean c1 = a > b;
		System.out.println("Result of First Scenario: " + c1);

		c1 = a < b;
		System.out.println("Result of Second Scenario: " + c1);

		a = 10;
		c1 = a >= b;
		System.out.println("Result of Third Scenario: " + c1);

		b = 5;
		c1 = a <= b;
		System.out.println("Result of Fourth Scenario: " + c1);

		b = 20;
		c1 = a <= b;
		System.out.println("Result of Fifth Scenario: " + c1);

		a = 10;
		b = 80;
		c1 = a != b;
		System.out.println("Result of Sixth Scenario: " + c1);

		a = 10;
		b = 10;
		c1 = a != b;
		System.out.println("Result of Seventh Scenario: " + c1);

		a = 10;
		b = 10;
		c1 = a == b;
		System.out.println("Result of Eighth Scenario: " + c1);

		a = 20;
		b = 10;
		c1 = a == b;
		System.out.println("Result of Ninth Scenario: " + c1);

		int x = 10;
		int y = 20;

		boolean z = y > x;

		boolean r1 = z && c1;
		System.out.println("Result of Tenth Scenario: " + r1);

		boolean r2 = z || c1;
		System.out.println("Result of Eleventh Scenario: " + r2);

		boolean r3 = !r1;
		System.out.println("Result of Twelveth Scenario: " + r3);

		boolean r4 = !r2;
		System.out.println("Result of Thirthteenth Scenario: " + r4);

	}

}
