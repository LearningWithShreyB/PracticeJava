package day23;

public class MainProtectedCall01 {

	public static void main(String[] args) {
		ProtectedAccessModifierPractice o4 = new ProtectedAccessModifierPractice();
		System.out.println("The value of protected variable: " + o4.f4);
		o4.m5(200);
		o4.m6();

	}

}
