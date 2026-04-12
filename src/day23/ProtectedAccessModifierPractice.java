package day23;

public class ProtectedAccessModifierPractice {

	protected int f4 = 100;

	protected void m5(int f5) {
		System.out.println("This is a protected method which holds one value: " + f5);
	}

	public void m6() {
		System.out.println("This is a method from package day23 which cant be access directly outside package.");
	}

}
