package day23;

public class DefaultAccessModifierPractice {

	int f2;

	void m3(int f2) {
		this.f2 = f2;
		System.out.println("This is a default method which holds one value: " + this.f2);
	}

	public void m4() {
		System.out.println("This is a method from package day23 which cant be access directly outside package.");
	}

}
