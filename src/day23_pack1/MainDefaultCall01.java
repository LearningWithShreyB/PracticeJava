package day23_pack1;

import day23.DefaultAccessModifierPractice;

public class MainDefaultCall01 {

	public static void main(String[] args) {
		DefaultAccessModifierPractice o3 = new DefaultAccessModifierPractice();
		/*
		 * This can't be access System.out.println("The value of variable: " + o3.f2);
		 * o3.m3(200);
		 */
		o3.m4();

	}

}
