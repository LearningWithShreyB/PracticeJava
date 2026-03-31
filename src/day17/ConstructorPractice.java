package day17;

public class ConstructorPractice {

	int a, b, c;

	ConstructorPractice() {
		System.out.println("This is a default constructor");
	}

	ConstructorPractice(int a, int b) {
		this.a = a;
		this.b = b;
		c = a * b;
		System.out.println("The result is: " + c);

	}

	ConstructorPractice(int a1, int a2, int a3) {
		if (a1 >= a2 && a1 >= a3) {
			System.out.println("The first number is largest!!");
		} else if (a2 >= a3 && a2 >= a1) {
			System.out.println("The second number is largest!!");
		} else {
			System.out.println("The third number is largest!!");
		}

	}

}
