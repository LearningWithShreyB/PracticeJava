package day23;

public class PublicAccessModifierPractice {

	public int f6 = 500;

	public void m7(int f7) {
		System.out.println("This is a public method from package day23 which holds one value: " + f7);
	}

	public void m8() {
		System.out.println("This is a method from package day23 which cant be access directly outside package.");
	}

}
