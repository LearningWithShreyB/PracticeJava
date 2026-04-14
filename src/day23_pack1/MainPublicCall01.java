package day23_pack1;

import day23.PublicAccessModifierPractice;

public class MainPublicCall01 {

	public static void main(String[] args) {
		PublicAccessModifierPractice o8 = new PublicAccessModifierPractice();
		System.out.println("The value of variable from package day23: " + o8.f6);
		o8.m7(800);

		o8.m8();

	}

}
