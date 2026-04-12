package day23;

public class PrivateAccessModifierPractice {

	private int f1 = 100;

	private void m1() {
		System.out.println("This is a private method which holds one private variable value: " + f1);
	}

	void m2() {
		System.out.println(
				"This is a method after which I call private method which cant be access directly outside class.");
		m1();
	}

}
