package day23_pack1;

import day23.ProtectedAccessModifierPractice;

public class MainProtectedCall01 extends ProtectedAccessModifierPractice {

	public static void main(String[] args) {
		ProtectedAccessModifierPractice o5 = new ProtectedAccessModifierPractice();
		/*
		 * This is not accessible unless its inherited
		 * System.out.println("The value of default variable: " + o5.f4); o5.m5(200);
		 */
		o5.m6();

		MainProtectedCall01 o6 = new MainProtectedCall01();
		System.out.println("The value of protected variable: " + o6.f4);
		o6.m5(400);
		o6.m6();

	}

}
