package day19;

import java.util.Scanner;

class F {
	int f;

	void show6() {
		System.out.println("The value of class F method is: " + f);
	}
}

class G extends F {
	int g;

	void show7() {
		System.out.println("The value of class G method is: " + g);
	}

	void overrideScenario() {
		System.out.println("This is a method which is coming from class G");
	}
}

class H extends F {
	int h;

	void show8() {
		System.out.println("The value of class H method is: " + h);
	}

	void overrideScenario() {
		System.out.println("This is a method which is coming from class H");
	}
}

public class HeirarchicalInheritancePractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		G obj3 = new G();

		System.out.println("Enter a number for class F: ");
		obj3.f = sc.nextInt();
		System.out.println("Enter a number for class G: ");
		obj3.g = sc.nextInt();

		obj3.show6();
		obj3.show7();
		obj3.overrideScenario();

		H obj4 = new H();

		System.out.println("Enter a number for class F: ");
		obj4.f = sc.nextInt();
		System.out.println("Enter a number for class H: ");
		obj4.h = sc.nextInt();

		obj4.show6();
		obj4.show8();
		obj4.overrideScenario();

		sc.close();

	}

}
