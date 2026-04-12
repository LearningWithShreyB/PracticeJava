package day23_pack1;

import day23.ProtectedAccessModifierPractice;

public class MainProtectedCall01 {

	public static void main(String[] args) {
		ProtectedAccessModifierPractice o5 = new ProtectedAccessModifierPractice();
		/* This is not accessible unless its inherited
		System.out.println("The value of default variable: " + o5.f4);
		o5.m5(200);*/
		o5.m6();

	}

}
