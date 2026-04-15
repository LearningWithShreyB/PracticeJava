package day24;

public class Main02 {

	public static void main(String[] args) {

		Parent p1 = new Child01();
		System.out.println("The variable from parent class: " + p1.m1);
		p1.m2();

	}

}
