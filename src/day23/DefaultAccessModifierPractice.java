package day23;

public class DefaultAccessModifierPractice {

	int f2 = 100;

	void m3(int f3) {
		System.out.println("This is a default method which holds one value: " + f3);
	}

	public void m4() {
		System.out.println("This is a method from package day23 which cant be access directly outside package.");
	}

}
